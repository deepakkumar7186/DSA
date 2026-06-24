class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int prime = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) prime++;
        }

        return prime;
    }
}

// class Solution {
//     public int countPrimes(int n) {
//         int prime = 0;
//         //int check = 0;
//         if(n == 0 || n == 1 || n == 2){
//             prime = 0;
//             return prime;
//         }
//         for(int i = n-1 ; i > 1 ; i--){
//             boolean isPrime = true;
//             for(int j = 2 ; j*j <= i ; j++){   
//                 if(i % j == 0){  
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if(isPrime){
//                 prime++;
//             }
//         }
//         return prime;
//     }
// }