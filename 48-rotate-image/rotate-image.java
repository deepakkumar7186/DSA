// class Solution {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;
//         //int[][] mat = new int[n][n];

//         for(int i = 0 ; i < n ; i++){
//             for(int j = n-1 ; j >= 0 ; j--){
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//                 //System.out.print(matrix[j][i]);
//             }
//         }
//             //System.out.println();
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n / 2; j++) {
//                     int temp = matrix[i][j];
//                     matrix[i][j] = matrix[i][n - 1 - j];
//                     matrix[i][n - 1 - j] = temp;
//                 }
//             }
//     }
//             public static void printMatrix(int[][] matrix) {
//                 for (int[] row : matrix) {
//                     for (int val : row) {
//                         System.out.print(val + " ");
//                     }
//                     System.out.println();
//                 }
//             }


// }

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

   
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}