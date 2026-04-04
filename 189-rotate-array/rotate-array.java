class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
        k = k % n;
        // Deepak k
        int[] temp = new int[n];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        for (int i = 0; i < n - k; i++) {
            temp[k + i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }

    }
    public static void main(String args[]){
        Solution obj = new Solution();
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        obj.rotate(arr,k);
    }
}