import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
        // Arrays.sort(nums);
        // int find = 0;
        // for(int i = 0 ; i < nums.length ; i++){
           
        // }
        // return find;
    }
}