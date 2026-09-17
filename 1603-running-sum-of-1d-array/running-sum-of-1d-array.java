class Solution {
    public int[] runningSum(int[] nums) { 
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] + sum;   // 1 + 0 = 1      2+1 = 3   6  4
            sum = nums[i];    // 1    3    6     10
        }
        return nums;
    }
}