class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        int[][] score = new int[n][n];
        int[][] paths = new int[n][n];
        int MOD = 1_000_000_007;

        // Start at 'E'
        paths[n-1][n-1] = 1;

        for (int i = n-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                char c = board.get(i).charAt(j);
                if (c == 'X') continue; // obstacle

                // Skip start cell 'E'
                if (!(i == n-1 && j == n-1)) {
                    int maxScore = -1;
                    int ways = 0;

                    // Check 3 possible moves
                    int[][] dirs = {{1,0},{0,1},{1,1}};
                    for (int[] d : dirs) {
                        int ni = i + d[0], nj = j + d[1];
                        if (ni < n && nj < n && paths[ni][nj] > 0) {
                            if (score[ni][nj] > maxScore) {
                                maxScore = score[ni][nj];
                                ways = paths[ni][nj];
                            } else if (score[ni][nj] == maxScore) {
                                ways = (ways + paths[ni][nj]) % MOD;
                            }
                        }
                    }

                    if (ways > 0) {
                        score[i][j] = maxScore + (Character.isDigit(c) ? c - '0' : 0);
                        paths[i][j] = ways;
                    }
                }
            }
        }

        return new int[]{score[0][0], paths[0][0]};
    }
}
