class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%3 == 0 && nums[i]%2 == 0){
                sum += nums[i];
                count++;
            }
        }
        if(count == 0 || sum == 0){
            return count;
        }
        return sum/count;
    }
}