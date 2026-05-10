class Solution {
    public int findDuplicate(int[] nums) {
        // Phase 1: Detect cycle
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        // Phase 2: Find entrance to cycle (duplicate)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
}
// import java.util.Arrays;
// class Solution {
//     public int findDuplicate(int[] nums) {
//         int count = 0;
//         int num = nums[0];
//         Arrays.sort(nums);
//         for(int i = 0 ; i < nums.length ; i++){
//             if(nums[i] == num){
//                 num = nums[i];
//             }
//             // else{
//             //     num = nums[i];
//             // }
//         }
//         return num;
//     }
// }