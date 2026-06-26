// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int sp = 0;
//         int ep = nums.length-1;
//         int mid = (sp+ep)/2;
//         int k = 0;
//         int[] arr = {-1, -1};

//         if(nums.length == 0) return arr;
//         if(nums.length == 1 && nums[0] == target){
//             arr[k] = 0;
//             arr[k+1] = 0;
//             return arr;
//         }

//         if(nums[mid] == target){
//             arr[k] = mid;
//             if(mid - 1 >= 0 && nums[mid-1] == target){
//                 arr[k] = mid-1;
//                 k++;
//             }
//             if(mid + 1 < nums.length && nums[mid+1] == target){
//                 arr[k] = mid+1;
//                 k++;
//             }
//         }
//         else if(nums[mid] > target){
//             for(int i = 0 ; i < mid ; i++){
//                 if(nums[i] == target){
//                     arr[k] = i;
//                     k++;
//                 }
//             }
//         }
//         else{
//             for(int i = mid+1 ; i < nums.length ; i++){
//                 if(nums[i] == target){
//                     arr[k] = i;
//                     k++;
//                 }
//             }
//         }
//         return arr;
//     }
// }
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int sp = 0;
        int ep = nums.length - 1;
        int mid = (sp + ep) / 2;
        int[] arr = {-1, -1};

        if (nums.length == 0) return arr;
        if (nums.length == 1 && nums[0] == target) {
            arr[0] = 0;
            arr[1] = 0;
            return arr;
        }

        if (nums[mid] == target) {
            int left = mid;
            int right = mid;
            while (left - 1 >= 0 && nums[left - 1] == target) {
                left--;
            }
            while (right + 1 < nums.length && nums[right + 1] == target) {
                right++;
            }
            arr[0] = left;
            arr[1] = right;
        } else if (nums[mid] > target) {
            for (int i = 0; i < mid; i++) {
                if (nums[i] == target) {
                    arr[0] = i;
                    while (i + 1 < mid && nums[i + 1] == target) i++;
                    arr[1] = i;
                    break;
                }
            }
        } else {
            for (int i = mid + 1; i < nums.length; i++) {
                if (nums[i] == target) {
                    arr[0] = i;
                    while (i + 1 < nums.length && nums[i + 1] == target) i++;
                    arr[1] = i;
                    break;
                }
            }
        }
        return arr;
    }
}
