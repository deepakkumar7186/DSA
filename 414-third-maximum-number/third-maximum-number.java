import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int distinctCount = 0;
        int prev = Integer.MIN_VALUE;
        boolean hasPrev = false;

        for (int i = n - 1; i >= 0; i--) {
            if (!hasPrev || nums[i] != prev) {
                distinctCount++;
                prev = nums[i];
                hasPrev = true;
            }
            if (distinctCount == 3) {
                return nums[i];
            }
        }
        return nums[n - 1];
    }
}
