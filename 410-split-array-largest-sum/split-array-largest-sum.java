class Solution {
    public int splitArray(int[] nums, int k) {
        int max = 0;
        long sum = 0;
        
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }
        long left = max;
        long right = sum;
        long ans = sum; 
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) ans;
    }
    private boolean canSplit(int[] nums, int k, long target) {
        int count = 1;
        long currentSum = 0;
        
        for (int num : nums) {
            if (currentSum + num > target) {
                count++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }
        return count <= k;
    }
}