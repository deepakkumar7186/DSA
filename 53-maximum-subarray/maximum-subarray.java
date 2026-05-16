class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
        // int max = nums[0];
        // int sum;
        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int  j = i ; j < nums.length ; j++){
        //         sum = 0;
        //         for(int k = i ; k <= j ; k++){
        //             sum += nums[k];
        //         }
        //         if(max < sum){
        //             max = sum;
        //         }
        //     }
        // }
        // return max;
    }
}