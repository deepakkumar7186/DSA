class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] targetCount = digitCount(n);
        for (int i = 0; i <= 30; i++) {
            int powerOfTwo = 1 << i;
            if (sameCount(targetCount, digitCount(powerOfTwo))) {
                return true;
            }
        }
        return false;
    }
    private int[] digitCount(int x) {
        int[] count = new int[10];
        while (x > 0) {
            count[x % 10]++;
            x /= 10;
        }
        return count;
    }
    private boolean sameCount(int[] a, int[] b) {
        for (int d = 0; d < 10; d++) {
            if (a[d] != b[d]) {
                return false;
            }
        }
        return true;
    }
}