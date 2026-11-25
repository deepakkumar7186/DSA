import java.util.HashMap;
import java.util.Map;
class Solution {
    private static final long BASE = 1315423911L;
    private static final long MOD = 1_000_000_007L;

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        long[] prefixHash = new long[n + 1];
        long[] power = new long[n + 1];
        power[0] = 1L;

        for (int i = 0; i < n; i++) {
            long val = (nums[i] % MOD + MOD) % MOD + 1L;
            prefixHash[i + 1] = (prefixHash[i] * BASE + val) % MOD;
            power[i + 1] = (power[i] * BASE) % MOD;
        }

        int low = 1;
        int high = n;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (hasUniqueSubarrayOfLength(mid, n, prefixHash, power)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean hasUniqueSubarrayOfLength(int len, int n, long[] prefixHash, long[] power) {
        Map<Long, Integer> freq = new HashMap<>();
        long powLen = power[len];
        for (int start = 0; start + len <= n; start++) {
            int end = start + len;
            long hash = (prefixHash[end] - (prefixHash[start] * powLen) % MOD + MOD) % MOD;
            freq.put(hash, freq.getOrDefault(hash, 0) + 1);
        }
        for (int count : freq.values()) {
            if (count == 1) {
                return true;
            }
        }

        return false;
    }
}