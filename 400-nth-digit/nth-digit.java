class Solution {
    public int findNthDigit(int n) {
        int num = 0;
        if(n <= 9){
            num = n;
        }
        else if(n == 10){
            num = 1;
        }
        else if(n == 11){
            num = 0;
        }
        // else if(n > 11){
        //     // n = n - 1;
        //     // n = n%10;
        //     // num = n;
        //     int pos = n - 1;
        //     num = pos%10;
        // }
        else {
            long base = 9, digits = 1;
            long count = base * digits;

            while (n > count) {
                n -= count;
                digits++;
                base *= 10;
                count = base * digits;
            }

            long start = (long)Math.pow(10, digits - 1);
            long numVal = start + (n - 1) / digits;
            int index = (n - 1) % (int)digits;
            num = String.valueOf(numVal).charAt(index) - '0';
        }
        return num;
    }
}