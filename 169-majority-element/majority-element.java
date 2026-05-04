// class Solution {
//     public int majorityElement(int[] nums) {
//         int ele1 = nums[0];
//         int ele2 = nums[0];
//         int var = 0;
//         int terms1 = 0;
//         int terms2 = 0;
//         int max_num = 0;
//         for(int i = 0 ; i < nums.length ; i++){
//             if(nums[i] == ele1){
//                 terms1++;
//             }
            
//         }
//         ele2 = -1;
//         terms2 = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != ele1) {
//                 ele2 = nums[i];
//                 break;
//             }
//         }

       
//         if (ele2 != -1) {
//             for (int i = 0; i < nums.length; i++) {
//                 if (nums[i] == ele2) {
//                     terms2++;
//                 }
//             }
//         }


//         if(terms1 >= terms2){
//             max_num = ele1;
//         }
//         else{
//             max_num = ele2;
//         }
//         return max_num;
//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
