import java.util.Arrays;
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int ans = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] arr = new int[rows * cols];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[index++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k - 1];
        // for(int i = 1 ; i < arr.length ; i++){
        //     if(arr[i] == k){
        //         ans = arr[i];
        //     }
        // }
        // return ans;
    }
}