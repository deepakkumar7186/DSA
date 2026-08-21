class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 10 && i == nums[i]) {
                return i;
            }
            if(nums[i] > 9){
                int temp = nums[i];
                int idx = 0;
                while(temp != 0){
                    idx += temp % 10;
                    temp /= 10;
                }
                if(idx == i){
                    return i;
                }
            }
        }
        return -1;
    }
}
