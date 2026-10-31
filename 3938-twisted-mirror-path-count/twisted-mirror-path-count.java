class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 1_000_000_007;

        // go[i][j][0]: target (r, c) if trying to move RIGHT from (i, j)
        // go[i][j][1]: target (r, c) if trying to move DOWN from (i, j)
        // We store encoded index: r * n + c, or -1 if out of bounds.
        int[][][] go = new int[m][n][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                go[i][j][0] = getTarget(grid, i, j, 0, m, n);
                go[i][j][1] = getTarget(grid, i, j, 1, m, n);
            }
        }

        long[][] dp = new long[m][n];
        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == 0) continue;

                // Try moving right
                int targetRight = go[i][j][0];
                if (targetRight != -1) {
                    int r = targetRight / n;
                    int c = targetRight % n;
                    dp[r][c] = (dp[r][c] + dp[i][j]) % MOD;
                }

                // Try moving down
                int targetDown = go[i][j][1];
                if (targetDown != -1) {
                    int r = targetDown / n;
                    int c = targetDown % n;
                    dp[r][c] = (dp[r][c] + dp[i][j]) % MOD;
                }
            }
        }

        return (int) dp[m - 1][n - 1];
    }

    private int getTarget(int[][] grid, int r, int c, int dir, int m, int n) {
        // dir: 0 for right, 1 for down
        int curR = r;
        int curC = c;
        int curDir = dir;

        while (true) {
            int nextR = curR + (curDir == 1 ? 1 : 0);
            int nextC = curC + (curDir == 0 ? 1 : 0);

            if (nextR < 0 || nextR >= m || nextC < 0 || nextC >= n) {
                return -1; // Out of bounds
            }

            if (grid[nextR][nextC] == 0) {
                return nextR * n + nextC; // Lands on an empty cell
            } else {
                // Hit a mirror cell, reflect immediately:
                // If entered while moving right (0), turn down (1).
                // If entered while moving down (1), turn right (0).
                curDir = 1 - curDir;
                curR = nextR;
                curC = nextC;
            }
        }
    }
}