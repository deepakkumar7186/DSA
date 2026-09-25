class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int prev2 = 0;
        int prev1 = 0; 
        
        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(min > nums[i]){
        //         min = nums[i];
        //     }
        //     if(max < nums[i]){
        //         max = nums[i];
        //     }
        // }
        
    }
}