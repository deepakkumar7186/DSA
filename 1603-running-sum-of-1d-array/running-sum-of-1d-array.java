class Solution {
    public int[] runningSum(int[] nums) {
        int k = 0;
        int pre = nums[k];
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] = nums[i-1] + nums[i];

           
        }
       
        return nums;
    }
}