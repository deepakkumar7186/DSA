class Solution {
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
          int count = 0;
        for (int num = left; num <= right; num++) {
            int setBits = Integer.bitCount(num); // built-in method
            if (isPrime(setBits)) {
                count++;
            }
        }
        return count;
    
    }
}