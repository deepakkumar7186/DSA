class Solution {
    public int countCommas(int n) {
        int count = 0;
        int m = n;
        while(n != 0){
            count++;
            n /= 10;
        }
        if(count < 4){
            return 0;
        }
        // int countComma = 0;
        // if(m%10 == 0){
        //     m--;
        //     countComma++;
        // }
        // while(m%1000 != 0){
        //     countComma++;
        //     m--;
        // }
        return m - 1000 + 1;
    }
}