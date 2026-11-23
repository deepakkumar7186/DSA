class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int m = n;
        while(n > 0){
            sum += n%10;
            mul *= n%10;
            n /= 10;
        }
        if(m % (sum + mul) ==  0){
            return true;
        }
        return false;
    }
}