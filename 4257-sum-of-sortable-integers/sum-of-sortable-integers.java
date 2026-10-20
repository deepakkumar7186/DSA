import java.util.Arrays;

class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        
        long totalSum = 0;
        
        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }
            
            boolean isSortable = true;
            
            for (int i = 0; i < n; i += k) {
                if (!isValidRotation(nums, i, sortedNums, i, k)) {
                    isSortable = false;
                    break;
                }
            }
            
            if (isSortable) {
                totalSum += k;
            }
        }
        
        return (int) totalSum;
    }
    
    private boolean isValidRotation(int[] nums, int startNums, int[] sortedNums, int startSorted, int k) {
        // Find how many elements match the sorted sequence with a cyclic shift offset
        // Find the relative position of nums[startNums] in the sorted block
        int firstVal = nums[startNums];
    
        for (int offset = 0; offset < k; offset++) {
            if (sortedNums[startSorted + offset] == firstVal) {
                boolean match = true;
                for (int j = 0; j < k; j++) {
                    if (nums[startNums + j] != sortedNums[startSorted + (offset + j) % k]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        
        return false;
    }
}