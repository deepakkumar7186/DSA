class Solution {
    public boolean isPowerOfTwo(int n) {
        // int x = 0;
        // if (n <= 0) return false;
        
        // if(n == 1){
        //     return true;
        // }
        // while(n != Math.pow(2,x) && n > x/2){
        //     x++;
        // }
        // if(n == Math.pow(2, x)){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}