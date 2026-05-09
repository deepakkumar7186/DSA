class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}

// class Solution {
//     public int pivotIndex(int[] nums) {
//         int leftS = nums[0];
//         int rightS = 0;
//         int idx = -1;
//         for(int i = 0 ; i < nums.length ; i++){
//             rightS = rightS + nums[i];
//         }
//         for(int i = 1 ; i < nums.length ; i++){
//             if(nums[i] == rightS){
//                 rightS -= nums[i];
//             }
//             if(leftS == rightS){
//                 idx = i;
//             }
//         }
//         return idx;
//     }
// }