class Solution {
    public int pivotInteger(int n) {
        if(n == 1){
            return n;
        }
        int ans = -1;
        int leftsum = 0;
        int totalsum = n * (n + 1) / 2;
        for(int i = 1 ; i <= n ; i++){
            leftsum += i;                          
            int rightsum = totalsum - leftsum + i; 
            if (leftsum == rightsum) {
                return i;  
            }
        }
        return ans;
    }
}