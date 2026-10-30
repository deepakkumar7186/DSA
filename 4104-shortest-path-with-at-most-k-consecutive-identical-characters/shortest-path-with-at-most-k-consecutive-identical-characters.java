import java.util.*;

class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        // Build adjacency list: u -> list of {v, w}
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(new int[]{edge[1], edge[2]});
        }
        
        // Min-priority queue storing {weight, node, consecutive_count}
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        
        // visited[node][count] to keep track of the minimum weight to reach a state
        int[][] dist = new int[n][k + 1];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        // Starting state at node 0 with count = 1
        pq.offer(new int[]{0, 0, 1});
        dist[0][1] = 0;
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0], u = curr[1], count = curr[2];
            
            // If we reached the destination node
            if (u == n - 1) {
                return d;
            }
            
            if (d > dist[u][count]) {
                continue;
            }
            
            for (int[] neighbor : graph[u]) {
                int v = neighbor[0];
                int w = neighbor[1];
                
                // Determine next count
                int nextCount = (labels.charAt(u) == labels.charAt(v)) ? count + 1 : 1;
                
                // Check constraint
                if (nextCount <= k) {
                    if (d + w < dist[v][nextCount]) {
                        dist[v][nextCount] = d + w;
                        pq.offer(new int[]{d + w, v, nextCount});
                    }
                }
            }
        }
        
        return -1;
    }
}