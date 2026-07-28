class Solution {
    public int maximumXOR(int[] nums) {
         int result = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            result |= nums[i];  
        }
        return result;
        // if (nums.length == 1) {
        //     return nums[0];
        // }
        // int result = 0;
        // for (int i = 0 ; i < nums.length ; i++) {
        //     for (int j = i+1 ; j < nums.length ; j++) {
        //         int xorVal = nums[i] ^ nums[j];
        //         if (xorVal > result) {
        //             result = xorVal;
        //         }
        //     }
        // }
        // // if(nums.length > 100){
        // //     return result+1;
        // // }
        // return result;
    }
}
