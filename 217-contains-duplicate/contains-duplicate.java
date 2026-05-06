import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //int duplicate = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if (set.contains(nums[i])) {
                return true; 
            }
            set.add(nums[i]);
            // for(int j = 0 ; j <= i ; j++){
            //     if(i == j){
            //         continue;
            //     }
            //     else if(nums[i] == nums[j]){
            //         duplicate++;
            //     }
            // }
        }
        // if(duplicate > 0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return false;
    }
}