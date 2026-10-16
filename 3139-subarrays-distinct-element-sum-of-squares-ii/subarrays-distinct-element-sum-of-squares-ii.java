import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final int MOD = 1_000_000_007;

    class Node {
        long sumSquares;
        long sumVal;
        long lazy;
        int left, right;

        Node(int l, int r) {
            left = l;
            right = r;
            sumSquares = 0;
            sumVal = 0;
            lazy = 0;
        }
    }

    private Node[] tree;

    public int sumCounts(int[] nums) {
        int n = nums.length;
        tree = new Node[4 * n];
        build(1, 0, n - 1);

        Map<Integer, Integer> lastSeen = new HashMap<>();
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int prevIndex = lastSeen.getOrDefault(x, -1);

            // Update range [prevIndex + 1, i] by adding 1 to distinct counts
            update(1, prevIndex + 1, i, 1);

            // The root node holds the sum of squares of all subarrays ending at i
            totalSum = (totalSum + tree[1].sumSquares) % MOD;

            lastSeen.put(x, i);
        }

        return (int) totalSum;
    }

    private void build(int node, int l, int r) {
        tree[node] = new Node(l, r);
        if (l == r) return;
        int mid = l + (r - l) / 2;
        build(2 * node, l, mid);
        build(2 * node + 1, mid + 1, r);
    }

    private void applyLazy(int node, long val) {
        long len = (tree[node].right - tree[node].left + 1);
        // new_sumSquares = sumSquares + 2 * val * sumVal + val * val * len
        long addedSquares = (2 * val % MOD * tree[node].sumVal % MOD + val * val % MOD * len % MOD) % MOD;
        tree[node].sumSquares = (tree[node].sumSquares + addedSquares) % MOD;
        
        // new_sumVal = sumVal + val * len
        tree[node].sumVal = (tree[node].sumVal + val * len % MOD) % MOD;
        
        tree[node].lazy = (tree[node].lazy + val) % MOD;
    }

    private void pushDown(int node) {
        if (tree[node].lazy != 0) {
            applyLazy(2 * node, tree[node].lazy);
            applyLazy(2 * node + 1, tree[node].lazy);
            tree[node].lazy = 0;
        }
    }

    private void update(int node, int l, int r, long val) {
        if (tree[node].left >= l && tree[node].right <= r) {
            applyLazy(node, val);
            return;
        }
        pushDown(node);
        int mid = tree[node].left + (tree[node].right - tree[node].left) / 2;
        if (l <= mid) update(2 * node, l, r, val);
        if (r > mid) update(2 * node + 1, l, r, val);
        
        tree[node].sumSquares = (tree[2 * node].sumSquares + tree[2 * node + 1].sumSquares) % MOD;
        tree[node].sumVal = (tree[2 * node].sumVal + tree[2 * node + 1].sumVal) % MOD;
    }
}