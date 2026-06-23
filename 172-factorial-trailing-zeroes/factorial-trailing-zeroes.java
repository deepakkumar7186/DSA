class Solution {
    public int trailingZeroes(int n) {
        int cou = 0;
        //int fact = 1;
        if(n == 0){
            return 0;
        }
        
        while(n != 0){
            cou += n / 5;
            n /= 5;
        }
        return cou;
    }
}
