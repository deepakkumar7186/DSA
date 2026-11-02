class Solution {
    public int minMoves2(int[] nums) {
        java.util.Arrays.sort(nums);
        int median = nums[nums.length / 2];
        int counter = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            counter += Math.abs(nums[i] - median);
        }
        return counter;
        // int max = Integer.MIN_VALUE;
        // int sec_Max = Integer.MIN_VALUE;

        // for(int i = 0 ; i < nums.length ; i++){
        //     if(max < nums[i]){
        //         max = nums[i];
        //     }if(sec_Max < nums[i] && nums[i] != max){
        //         sec_Max = nums[i];
        //     }
        // }
        // int counter = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] < sec_Max){
        //         while(nums[i] != sec_Max){
        //             counter++;
        //             nums[i] += 1;
        //         }
        //     }
        //     else{
        //         while(nums[i] != sec_Max){
        //             counter++;
        //             nums[i] -= 1;
        //         }
        //     }
        // }
        // return counter;
    }
}