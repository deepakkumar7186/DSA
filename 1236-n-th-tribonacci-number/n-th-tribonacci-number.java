class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int tn = 0;
        for(int i = 3 ; i <= n ; i++){
            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }
        return tn;
        // int sum = 0;
        // int sum4 = 0;
        // int[] arr = new int[n];
        // arr[0] = 0;
        // arr[1] = 1;
        // arr[2] = 1;
        // int fib = 0;
        // for(int i = 3 ; i < n ; i++){
        //     arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        //     sum += arr[i];
        //     // sum3 = arr[i-1] + arr[i-2];
        //     // sum4 = arr[i] + arr[i-1];
        // }
        // // if(sum3 > sum4){
        // //     return sum3;
        // // }
        // // else{
        // //     return sum4;
        // // }
        // return sum;
    }
}