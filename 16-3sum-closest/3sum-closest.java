import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int output = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE; // track smallest difference
        int res = 0; // store closest sum

        Arrays.sort(nums); // sorting is essential

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                output = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target - output);

                if (diff < ans) {
                    ans = diff;
                    res = output;
                }

                if (output < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}
// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         int output = 0;
//         int sum = 0;
//         int ans = Integer.MAX_VALUE;
//         int res = 0;
//         for(int i = 2 ; i < nums.length ; i++){
//             if(target == 0){
//                 output = nums[i-1] + nums[i] + nums[i-2];
//                 ans = output;
//             }
//             if(target == (i-1)){
//                 output = nums[i-2] + nums[i-1] + nums[i];
//                 ans = output;
//             }
//             else if(target == nums.length-1){
//                 output = nums[i] + nums[i-1] + nums[i-2];
//                 ans = output;
//             }
//             else if(target == i){
//                 ++i;
//                 output = nums[i] + nums[i-1] + nums[i-2];
//                 ans = output;
//             }
            
//         }
//         if(target == nums.length){
//             for(int i = 0 ; i < nums.length ; i++){
//                 sum = sum + nums[i] ;
                
//             }
//             ans = sum;
//         }
//         return ans;
        
//     }
// }