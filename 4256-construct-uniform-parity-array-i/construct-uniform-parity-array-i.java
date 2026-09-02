class Solution {
    public boolean uniformArray(int[] nums1) {
        return true;
        // int n = nums1.length;
        // if(n == 1){
        //     return true;
        // }
        // int[] arr = new int[n];
        // for(int i = 1 ; i < n ; i++){
        //     if(nums1[i]%2 == 0 && nums1[i-1]%2 == 0){
        //         return true;
        //     }
        //     else if(nums1[i]%2 != 0 && nums1[i-1]%2 != 0){
        //         return true;
        //     }
        //     else{
        //         arr[i-1] = nums1[i-1] - nums1[i];
        //         if(nums1[i]%2 == 0 && arr[i-1]%2 == 0){
        //             return true;
        //         }
        //         else if(nums1[i]%2 != 0 && arr[i-1]%2 != 0){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}