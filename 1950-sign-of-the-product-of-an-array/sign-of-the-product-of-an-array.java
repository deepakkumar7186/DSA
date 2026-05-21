// class Solution {
//     public int arraySign(int[] nums) {
//         int mul = 1;
//         for(int i = 0 ; i < nums.length ; i++){
//             if()
            
//             // mul *= nums[i];
//             // if(mul > 10 && mul < 100){
//             //     mul /= 10;
//             // }
//         //     else if(mul >= 100){
//         //         if((mul % 2) == 0)? mul = 1 :mul = -1;   
//         //     }
//         // }
//         return mul;
//     }
// }
class Solution {
    public int arraySign(int[] nums) {
        int mul = 1;   // track sign only
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;   // product is zero
            }
            if (nums[i] < 0) {
                mul *= -1;  // flip sign
            }
        }
        
        return mul;  // will be 1 or -1
    }
}
