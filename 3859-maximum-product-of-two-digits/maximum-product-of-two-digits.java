class Solution {
    public int maxProduct(int n) {
        int[] digits = new int[10];
        int count = 0;

        while (n != 0) {
            digits[count++] = n % 10;
            n /= 10;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                int product = digits[i] * digits[j];
                if (product > max) {
                    max = product;
                }
            }
        }

        return max;// int max = Integer.MIN_VALUE;
        // int rem1, rem2;

        // while (n > 9){
        //     rem1 = n % 10;
        //     rem2 = (n / 10) % 10;
        //     int product = rem1 * rem2;
        //     if (product > max) {
        //         max = product;
        //     }
        //     n /= 10;
        // }
        // return max;
    }
}