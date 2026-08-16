class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int m = x;
        while(m != 0){
            sum += m%10;
            m /= 10;
        }
        int ans = -1;
        if(x % sum == 0){
            ans = sum;
            return ans;
        }
        else{
            return ans;
        }
    }
}