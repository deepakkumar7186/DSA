// import java.util.*;
// class Solution {
//     public int[] removeElement (int[] nums, int val) {
//         for(int i = 0 ; i < nums.length ; i++){
//             if(nums[i] == val){
//                 i--;
//                 continue;
//             }

//         }
//         return nums;
//     }
//     public static void main(String args[]){
//         int[] arr = {0,1,2,2,3,0,4,2};
//         Solution obj= new Solution();
//         Scanner sc= new Scanner(System.in);
//         int val = sc.nextInt();
//         System.out.println("After Removing the array is :"+obj.removeElement(arr,val));
//     }
// }
import java.util.*;
class Solution {
    public int removeElement (int[] nums, int val) {
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}