class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int value = nums[0];
        int result = 0;

        for(int num: nums){

            result ^= num;
            // if(value != nums[i]){
            //     value = nums[i];
            // }
            // else{
            //     continue;
            // }
            
        }
        return result;
    }
}