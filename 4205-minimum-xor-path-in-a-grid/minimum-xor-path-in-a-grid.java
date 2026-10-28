import java.util.BitSet;

class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        BitSet[] dp = new BitSet[n];
        for (int j = 0; j < n; j++) {
            dp[j] = new BitSet(1024);
        }
        
        dp[0].set(grid[0][0]);
        
        for (int j = 1; j < n; j++) {
            for (int x = dp[j - 1].nextSetBit(0); x >= 0; x = dp[j - 1].nextSetBit(x + 1)) {
                dp[j].set(x ^ grid[0][j]);
            }
        }
        
        for (int i = 1; i < m; i++) {
            BitSet prev = new BitSet(1024);
            
            for (int j = 0; j < n; j++) {
                prev.clear();
                prev.or(dp[j]);
                if (j > 0) {
                    prev.or(dp[j - 1]);
                }
                
                dp[j].clear();
                for (int x = prev.nextSetBit(0); x >= 0; x = prev.nextSetBit(x + 1)) {
                    dp[j].set(x ^ grid[i][j]);
                }
            }
        }
        
        return dp[n - 1].nextSetBit(0);
    }
}