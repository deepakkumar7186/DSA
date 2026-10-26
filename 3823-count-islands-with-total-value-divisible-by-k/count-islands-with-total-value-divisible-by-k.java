class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int islandCount = 0;
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    long currentIslandSum = 0;
                    java.util.Queue<int[]> queue = new java.util.LinkedList<>();
                    
                    queue.offer(new int[]{i, j});
                    currentIslandSum += grid[i][j];
                    grid[i][j] = 0; 
                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        int r = cell[0];
                        int c = cell[1];
                        
                        for (int[] dir : directions) {
                            int nr = r + dir[0];
                            int nc = c + dir[1];
                            
                            if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] > 0) {
                                currentIslandSum += grid[nr][nc];
                                grid[nr][nc] = 0; // Mark as visited
                                queue.offer(new int[]{nr, nc});
                            }
                        }
                    }  
                    if (currentIslandSum % k == 0) {
                        islandCount++;
                    }
                }
            }
        }
        return islandCount;
    }
}