class Solution {
    public void moveZeroes(int[] arr) {
        int j = 0;
        //Deepak K
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String args[]) {
        Solution obj = new Solution();
        int[] arr = {0, 1, 0, 3, 14};
        obj.moveZeroes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}