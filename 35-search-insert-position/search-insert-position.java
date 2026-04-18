class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = 0;
        int i;

        for(i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                return i;
            }
            else if(target < nums[i]){
                return i;
            }
            n++;
        }
        for(i = 1 ; i < nums.length ; i++){
            if(nums[i-1] < target && nums[i] > target){
                i++;
                return i-1;
            }
            n++;
        }
        return i;
    }
}