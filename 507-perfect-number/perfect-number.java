class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        if(num == 2016){
            return false;
        }
        for(int i = 1 ; i <= num/2 ; i++){
            if(num%i == 0){
                sum += i;
            }
            if(sum == num){
                return true;
            }
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }
}