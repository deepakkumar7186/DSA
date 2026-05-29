// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] retVal;
//         if(nums[0] + nums[1] == target){
//             for(int i = 0 ; i < 2 ; i++){
//                 retVal[i] = i;
//             }
//             return retVal[];
//         }
//         else{
//             for(int i = 0 ; i < 2 ; i++){
//                 retVal[i] = i+1;
//             }
//             return retVal;
//         }
        
//     }
//     public static void main(String args[]){
//         int[] num = {2,7,11,15};
//         int target = 9;
//         Solution sc = new Solution();
//         System.out.println(sc.twoSum(num,target));
//     }
// }.
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through all pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // return indices
                }
            }
        }
        // If no solution found (though problem guarantees one)
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9;
        Solution sc = new Solution();
        System.out.println(Arrays.toString(sc.twoSum(num, target)));
        // Output: [0, 1]
    }
}