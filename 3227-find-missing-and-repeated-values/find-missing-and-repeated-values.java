import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;
        int[] freq = new int[total + 1]; 
        int[] arr = new int[2]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                freq[val]++;
            }
        }
        for (int k = 1; k <= total; k++) {
            if (freq[k] == 2) {
                arr[0] = k; 
            } else if (freq[k] == 0) {
                arr[1] = k; 
            }
        }
        return arr;
    }
}
