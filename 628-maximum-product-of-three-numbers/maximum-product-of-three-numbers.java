import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums); 
        int n = nums.length;
        
        int case1 = nums[n-1] * nums[n-2] * nums[n-3];
        int case2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(case1, case2);
    }
}
// class Solution {
//     public int maximumProduct(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         int n = nums.length;
       
//         for(int i = 0 ; i < n - 2 ; i++){
           
//             int temp = 1;
//             for(int j = i ; j < i+3 ; j++){
//                 temp *= nums[j];
//             }
//             if(temp > max){
//                 max = temp;
//             }
//         }
//         return max;
//     }
// }