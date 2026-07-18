import java.util.Arrays;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int greatest = nums[nums.length-1];
        int find = 1;

        for(int i = 1 ; i <= smallest ; i++){
            if(smallest%i==0 && greatest%i==0){
                find = i;
            }
        }
        return find;
    }
}