// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int min = 0;
//         int max = 0;
//         int mis;
//         for(int i = 0 ; i < nums.length ; i++){
//             if(nums[i] == 0){
//                 continue;
//             }
//             if(nums[i] < min){
//                 min = nums[i];
//             }
//             if(nums[i] > max){
//                 max = nums[i];
//             }
//         }
//         mis = min;
//         int ran = min;
//         for(int i = min ; i <= max ; i++){
//             if(i == 0){
//                 continue;
//             }

//             if(i == ran){
//                 System.out.println(i+" ");
//             }
//             else{
//                 mis = i;
//             }
//             ran++;
//         }
//         return mis;
//     }
// }

import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int min = 1;   // smallest positive must start at 1
        int max = 0;
        int mis = 1;

        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){       // only positives matter
                set.add(nums[i]);
                if(nums[i] > max){
                    max = nums[i];
                }
            }
        }

        int ran = min;
        for(int i = min ; i <= max ; i++){
            if(!set.contains(i)){  // check presence
                mis = i;
                return mis;
            }
            ran++;
        }
        return max + 1;  // if all 1..max are present, next missing is max+1
    }
}
