class Solution {
    public int commonFactors(int a, int b) {
        int count = 1;
        int max;
        if(a > b){
            max = b;
        }
        else{
            max = a;
        }
        for(int i = 2 ; i <= max ; i++){
            if(a%i == 0 && b%i == 0){
                count++;
            }
        }
        return count;
    }
}