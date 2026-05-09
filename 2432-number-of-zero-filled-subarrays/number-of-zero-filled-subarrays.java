class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long currentStreak = 0;
        // int sum = 0;
        // if(nums[0] == 0){
        //     sum++;
        // }
        // for(int i = 1 ; i < nums.length ; i++){
        //     if(nums[i] == 0){
        //         sum++;
        //     }
        //     if(nums[i] == nums[i-1]){
        //         sum++;
        //     }
        //     // if(nums[i] == nums[i-1] && nums[i] == nums[i-2] && i >= 0){
        //     //     sum++;
        //     // }

        for (int num : nums) {
            if (num == 0) {
                currentStreak++;
                count += currentStreak; 
            } else {
                currentStreak = 0;     
            }
        }
            
        
        return count;
    }
}