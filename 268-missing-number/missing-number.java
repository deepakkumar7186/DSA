class Solution {
    public int missingNumber(int[] nums) {
        // int min = arr[0];
        // int max = arr[0];
        int mis = 0; 
        // for(int i = 0 ; i < nums.length ; i++){
        //     if(arr[i] >= max){
        //         max = arr[i];
        //     }
        //     if(arr[i] < min){
        //         min = arr[i];
        //     }
        // }
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != mis){
                return mis;
            }
            mis++;
        }
        // mis;
        return mis;
    }
}