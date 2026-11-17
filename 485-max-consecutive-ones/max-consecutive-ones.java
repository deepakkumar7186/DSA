class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int itr = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                itr++;
            }
            else{
                if(max < itr){
                    max = itr;
                    // itr = 0;
                }
                itr = 0;
            }
        }
        if(max < itr){
            max = itr;
        }
        return max;
    }
}