import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int ran = 1;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (ran < nums[i]) {
                list.add(ran);
                ran++;
            }
            if (nums[i] == ran) {
                ran++;
            }
        }

        while (ran <= nums.length) {
            list.add(ran);
            ran++;
        }

        return list;
    }
}
// import java.util.Arrays;
// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         int ran = 1;
//         List<Integer> list = new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i = 0 ; i < nums.length ; i++){
//             // ran++;
//             if(nums[i] != ran){
//                 list.add(ran);
//             }
//             ran++;
//         }
//         return list;
//     }
// }