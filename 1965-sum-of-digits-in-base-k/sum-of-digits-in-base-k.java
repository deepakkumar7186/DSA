class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            sum += n % k;   
            n /= k;       
        }
        return sum;
        // int mod;
        // int div;
        // int sum = 0;

        // mod = n % k;
        // div = n / k;

        // if(div > 9){
        //     while(div != 0){
        //         sum = sum + div % 10;
        //         div /= 10;
        //     }
        //     div = sum;
        // }
        // return mod + div;
    }
}