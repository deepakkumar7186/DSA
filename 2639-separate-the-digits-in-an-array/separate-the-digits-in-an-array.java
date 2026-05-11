import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
            Stack<Integer> stack = new Stack<>();
            while (num > 0) {
                stack.push(num % 10);
                num /= 10;
            }
            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
// class Solution {
//     public int[] separateDigits(int[] nums) {
//         int n = 100;
//         int[] arr = new int[n];
//         int ran = 0;
//         int rem = 0;
//         int j = 0;

//         for(int i = 0 ; i < nums.length ; i++){
//             ran = nums[i];
//             while(ran != 0){
//                 rem = ran % 10;
//                 arr[j] = rem;
//                 ran = ran/10;
//                 j++;
//             }
//         }
//         return arr;
//     }
// }