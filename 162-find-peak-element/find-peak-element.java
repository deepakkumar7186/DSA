class Solution {
    public int findPeakElement(int[] nums) {
        int peak = Integer.MIN_VALUE;;
        int idx = 0;
    
        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i] >= peak){
                peak = nums[i];
                idx = i;
            }
            
            
        }
        return idx;
    }
}