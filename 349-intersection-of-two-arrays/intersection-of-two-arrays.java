class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n;
        if (nums1.length >= nums2.length) {
            n = nums2.length;
        } else {
            n = nums1.length;
        }
        int[] arr = new int[n];
        int a = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    boolean exists = false;
                    for (int k = 0; k < a; k++) {
                        if (arr[k] == nums1[i]) {
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) {
                        arr[a] = nums1[i];
                        a++;
                    }
                }
            }
        }
        int[] result = new int[a];
        for (int i = 0; i < a; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}
