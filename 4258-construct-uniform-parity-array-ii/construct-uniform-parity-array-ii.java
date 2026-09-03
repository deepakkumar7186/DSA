class Solution {
    public boolean uniformArray(int[] nums1) {
        int minVal = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int num : nums1) {
            if (num < minVal) {
                minVal = num;
            }
            if (num % 2 != 0) {
                hasOdd = true;
            }
        }
        // If the minimum element is odd, we can make all elements odd.
        // If there are no odd elements (all even), they are already uniform.
        return (minVal % 2 != 0) || !hasOdd;
    }
}