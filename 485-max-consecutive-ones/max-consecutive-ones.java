class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int itr = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                itr++;
            }
            else{
                if(itr > max){
                    max = itr;
                }
                itr = 0;
            }
        }
        if(itr > max){
            max = itr;
        }
        return max;
    }
}