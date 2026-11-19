class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int j = 0;
        for(int i = nums.length-1 ; i >= 0 ; i--){
            if(i == nums.length-1){
                j = nums.length-1;
            }

        }
        return nums[n-k+1];
    }
}