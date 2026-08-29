class Solution {
    public int countOperations(int num1, int num2) {
        if (num1 == num2 && num1 != 0) {
            return 1;
        }
        int i = 0;
        int res;
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                res = num1 - num2;
                num1 = res;
                i++;
            } else if (num1 < num2) {
                res = num2 - num1;
                num2 = res;
                i++;
            } else { 
                i++; 
                break; 
            }
        }
        return i;
    }
}
