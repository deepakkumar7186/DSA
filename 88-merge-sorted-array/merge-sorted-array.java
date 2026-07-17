class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int sum = m + n;
        int[] arr = new int[sum];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        while (i < m) {
            arr[k++] = nums1[i++];
        }
        while (j < n) {
            arr[k++] = nums2[j++];
        }

        for (int x = 0; x < sum; x++) {
            nums1[x] = arr[x];
        }
        // int sum = m + n ;
        // int[] arr = new int[sum];
        // int len = 0;
        // if(m >= n){
        //     len = n;
        // }
        // else{
        //     len = m;
        // }

        // if(m == 1 && n == 0 || m == 0 && n == 1){
        //     System.out.println(1);
        // } 
        // for(int i = 0 ; i < len ; i++){
        //     if(nums1[i] <= nums2[i]){
        //         arr[i] = nums1[i];
        //     }
        //     else{
        //         arr[i] = nums2[i];
        //     }
        // }
        // for(int i = 0 ; i < len ; i++){
        //     if(nums1[i] <= nums2[i]){
        //         arr[i] = nums1[i];
        //     }
        //     else{
        //         arr[i] = nums2[i];
        //     }
        // }
        
    }
}