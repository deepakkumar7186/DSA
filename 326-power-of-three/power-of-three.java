class Solution {
    public boolean isPowerOfThree(int n) {
        int res = 0;
        if(n <= 0){
           return false;
        }
        // int x = 1;
        // while(n/9 != x){
        //     if(Math.pow(3,x) == n){
        //         res = 1;
        //     }
        //     x++;
        // }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
        // if(res == 1){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
}