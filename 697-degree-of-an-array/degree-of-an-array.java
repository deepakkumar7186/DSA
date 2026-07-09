import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        int degree = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            first.putIfAbsent(x, i);
            last.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
            degree = Math.max(degree, count.get(x));
        }

        int minLen = nums.length;
        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                int len = last.get(x) - first.get(x) + 1;
                minLen = Math.min(minLen, len);
            }
        }

        return minLen;
    }
}