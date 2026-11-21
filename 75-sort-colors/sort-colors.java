class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
        // Arrays.sort(nums);
        // return nums;
        // for(int i = 0 ; i < nums.length ; i++){
        //     int min = 10;
        //     for(int j = i+1 ; j < nums.length ; j++){
        //         if(nums[j] < nums[i] && min > nums[j]){
        //             min = nums[j];
        //         }
        //     }
        //     nums[i] = min;
        // }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}