class Solution {
    static final int MOD = 1000000007;

    public int sumCounts(int[] nums) {
        int n = nums.length;
        long ans = 0;
        int[] last = new int[100001];
        long[] sum = new long[4 * n];
        long[] sq = new long[4 * n];
        int[] lazy = new int[4 * n];

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int prev = last[x];
            update(1, 0, n - 1, prev, i, sum, sq, lazy);
            last[x] = i + 1;
            ans = (ans + sq[1]) % MOD;
        }

        return (int) ans;
    }

    void update(int node, int l, int r, int ql, int qr,
                long[] sum, long[] sq, int[] lazy) {
        if (ql > r || qr < l) return;

        if (ql <= l && r <= qr) {
            sq[node] = (sq[node] + 2 * sum[node] + (r - l + 1)) % MOD;
            sum[node] = (sum[node] + (r - l + 1)) % MOD;
            lazy[node]++;
            return;
        }

        push(node, l, r, sum, sq, lazy);

        int mid = (l + r) / 2;
        update(node * 2, l, mid, ql, qr, sum, sq, lazy);
        update(node * 2 + 1, mid + 1, r, ql, qr, sum, sq, lazy);

        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        sq[node] = (sq[node * 2] + sq[node * 2 + 1]) % MOD;
    }

    void push(int node, int l, int r, long[] sum,
              long[] sq, int[] lazy) {
        if (lazy[node] == 0 || l == r) return;

        int mid = (l + r) / 2;
        apply(node * 2, l, mid, lazy[node], sum, sq, lazy);
        apply(node * 2 + 1, mid + 1, r, lazy[node], sum, sq, lazy);

        lazy[node] = 0;
    }

    void apply(int node, int l, int r, int v, long[] sum,
               long[] sq, int[] lazy) {
        long len = r - l + 1L;
        long inc = v;

        sq[node] = (sq[node] + 2 * inc % MOD * sum[node]
                   + inc * inc % MOD * len) % MOD;
        sum[node] = (sum[node] + inc * len) % MOD;
        lazy[node] += v;
    }
}