class Solution {
    public int[] sortedSquares(int[] nums) {
        //Deepak K
        int j ;
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i];

        }
        // for(int i = 0 ; i < nums.length ; i++){
        //     for(j = 0 ; j <= i ; j++){
        //         if(nums[j] > nums[i]){
        //             nums[j] = nums[i];
        //         }
        //     }
        // }
        // return nums;
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String args[]){
        Solution obj  = new Solution();
        int[] arr = {-4,-1,0,3,10};
        obj.sortedSquares(arr);
    }
}