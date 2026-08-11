class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] arr = new int[nums1.length];
        int idx = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    boolean found = false;

                    for (int z = j + 1; z < nums2.length; z++) {
                        if (nums2[z] > nums2[j]) {
                            arr[idx] = nums2[z];
                            idx++;
                            found = true;
                            break; 
                        }
                    }
                    if (!found) {
                        arr[idx] = -1;
                        idx++;
                    }
                }
            }
        }
        return arr;
        // int[] arr  = new int[nums1.length];
        // int idx = 0;
        // int target = 0;
        // for (int i = 0; i < nums1.length; i++) {
        //     for (int j = 0; j < nums2.length; j++) {
        //         if (nums1[i] == nums2[j]) {
        //             target = nums2[j];
        //             for(int z = j ; z < nums2.length ; z++){
        //                 if(target < nums2[z]){
        //                     arr[idx] = nums2[z];
        //                     idx++;
        //                 }
        //             }

        //             if((j + 1) < nums2.length && nums2[j] > nums2[j + 1] || (j == nums2.length-1)) {
        //                 arr[idx] = -1;
        //                 idx++;
        //             }
        //             // else if(j == nums2.length-1){
        //             //     arr[idx] = -1;
        //             // }
        //             else if ((j + 1) < nums2.length) {
        //                 arr[idx] = nums2[j + 1];
        //                 idx++;
        //             }
                    
        //         }
        //     }
        // }
        // return arr;
    }
}