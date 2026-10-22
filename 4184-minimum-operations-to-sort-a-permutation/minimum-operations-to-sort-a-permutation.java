import java.util.*;

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        
        int incShift = -1;
        boolean isInc = true;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                incShift = i;
            }
        }
        
        if (incShift != -1) {
            for (int i = 0; i < n; i++) {
                if (nums[(incShift + i) % n] != i) {
                    isInc = false;
                    break;
                }
            }
        } else {
            isInc = false;
        }
        
        int decShift = -1;
        boolean isDec = true;
        for (int i = 0; i < n; i++) {
            if (nums[i] == n - 1) {
                decShift = i;
            }
        }
        
        if (decShift != -1) {
            for (int i = 0; i < n; i++) {
                if (nums[(decShift + i) % n] != n - 1 - i) {
                    isDec = false;
                    break;
                }
            }
        } else {
            isDec = false;
        }
        
        if (!isInc && !isDec) {
            return -1;
        }
        
        int totalStates = 2 * n;
        int[] dist = new int[totalStates];
        Arrays.fill(dist, -1);
        
        Queue<Integer> queue = new LinkedList<>();
        
        dist[0] = 0;
        queue.offer(0);
        
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            
            int type = curr / n;
            int shift = curr % n;
            
            int nextShift = (shift + 1) % n;
            int nextState1 = type * n + nextShift;
            if (dist[nextState1] == -1) {
                dist[nextState1] = dist[curr] + 1;
                queue.offer(nextState1);
            }
            
            int nextType = 1 - type;
            int nextShiftRev = (n - shift) % n;
            int nextState2 = nextType * n + nextShiftRev;
            if (dist[nextState2] == -1) {
                dist[nextState2] = dist[curr] + 1;
                queue.offer(nextState2);
            }
        }
        
        if (isInc) {
            int s = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    s = i;
                    break;
                }
            }
            return dist[s];
        } else {
            int s = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] == n - 1) {
                    s = i;
                    break;
                }
            }
            return dist[n + s];
        }
    }
}