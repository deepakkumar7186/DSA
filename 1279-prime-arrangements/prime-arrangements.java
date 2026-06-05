class Solution {
    public int numPrimeArrangements(int n) {
        int mod = 1000000007;
        int primeCount = countPrimes(n);
        long res = factorial(primeCount, mod) * factorial(n - primeCount, mod) % mod;
        return (int) res;
    }

    private int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private long factorial(int x, int mod) {
        long ans = 1;
        for (int i = 2; i <= x; i++) {
            ans = (ans * i) % mod;
        }
        return ans;
    }
}
