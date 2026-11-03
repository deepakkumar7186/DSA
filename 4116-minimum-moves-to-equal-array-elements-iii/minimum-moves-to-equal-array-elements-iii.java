class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int counter = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < max){
                int diff = max - nums[i];
                counter += diff;
            }
        }
        return counter;
    }
}