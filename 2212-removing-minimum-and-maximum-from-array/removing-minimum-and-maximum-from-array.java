class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIdx]) minIdx = i;
            if (nums[i] > nums[maxIdx]) maxIdx = i;
        }

        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        int option1 = right + 1;
        int option2 = n - left;
        int option3 = (left + 1) + (n - right);

        return Math.min(option1, Math.min(option2, option3));
    }
}
// class Solution {

//     public int minimumDeletions(int[] nums) {
//         if(nums.length == 1){
//             return 1;
//         }
//         int n = nums.length;
//         int max = nums[0];
//         int min = nums[0];
//         int minId = 0;
//         int maxId = 0;

//         for(int i = 0 ; i < n ; i++){
//             if(max < nums[i]){
//                 max = nums[i];
//                 maxId = i;
//             }
//             if(min > nums[i]){
//                 min = nums[i];
//                 minId = i;
//             }
//         }
//         if((n - minId) < minId){
//             minId = n - minId;
//         }
//         else{
//             minId += 1;
//         }
//         if((n - maxId) < maxId){
//             maxId = n - maxId;
//         }
//         else{
//             maxId += 1;
//         }
//         return minId + maxId;
//     }
// }