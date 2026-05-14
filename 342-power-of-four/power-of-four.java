class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 0){
            return false;
        }

        return (n & (n - 1)) == 0 && (n % 3 == 1);
        
        // int x = 0;
        // int res = 0;
        // while(n >= n/4){
        //     if(n == Math.pow(x,4)){
        //         res = 1;
        //     }
        //     else{
        //         x++;
        //     }
        // }
        // if(res == 1){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
}