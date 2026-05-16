class Solution {
    private int mod = 1337;

    public int superPow(int a, int[] b) {
        int result = 1;
        for (int digit : b) {
            result = pow(result, 10) * pow(a, digit) % mod;
        }
        return result;
    }

    // Fast modular exponentiation
    private int pow(int a, int k) {
        int res = 1;
        a %= mod;
        for (int i = 0; i < k; i++) {
            res = (res * a) % mod;
        }
        return res;
    }
}
// class Solution {
//     public int superPow(int a, int[] b) {
//         private int mod = 1337;
//         int number = 1;
//         for (int digit : b) {
//             number = number * 10 + digit;  
//         }
        
//         int out = (int) Math.pow(a, number) % mod;

//         return out;
//     }
//     private int pow(int a, int k) {
//         int res = 1;
//         a %= mod;
//         for (int i = 0; i < k; i++) {
//             res = (res * a) % mod;
//         }
//         return res;
//     }
// }