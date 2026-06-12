class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr = new int[2];
        int k = 0;
        int similar = 0;
        for(int i = 0 ; i < nums.length ; i++){
            similar = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    similar++;
                }
            }
            if(similar == 1){
                arr[k] = nums[i];
                k++;
            }
        }
        return arr;
    }
}