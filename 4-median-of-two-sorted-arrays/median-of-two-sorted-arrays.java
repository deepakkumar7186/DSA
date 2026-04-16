// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         double m;
//         double n; double median;
//         for(int i = 0 ; i < nums1.length ; i++){
//             if(i == nums1.length -1){
//                 m = nums1[i];
//             }
//         }
//         for(int j = nums2.length -1 ; j >= 0 ; j--){
//             if(j == 0){
//                 n = nums2[j];
//             }
//         }
//         median = (m+n)/2;
//         // System.out.println("Median is :"+(m+n)/2);
//         return median;
//     }
// }
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) merged[k++] = nums1[i++];
            else merged[k++] = nums2[j++];
        }
        while (i < m) merged[k++] = nums1[i++];
        while (j < n) merged[k++] = nums2[j++];
        
        int len = merged.length;
        if (len % 2 == 0) return (merged[len/2 - 1] + merged[len/2]) / 2.0;
        else return merged[len/2];
    }
}
