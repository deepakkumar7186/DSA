class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        if(nums.length == k){
            return nums;
        }
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = sorted.length - k; i < sorted.length; i++) {
            count.put(sorted[i], count.getOrDefault(sorted[i], 0) + 1);
        }

        int[] arr = new int[k];
        int j = 0;
        for (int num : nums) {
            if (count.getOrDefault(num, 0) > 0) {
                arr[j++] = num;
                count.put(num, count.get(num) - 1);
                if (j == k) break;
            }
        }
        return arr;
    }
}