class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        else if(x < 0){
            return -1;
        }
        else{
            double num = Math.sqrt(x);
            int data = (int) Math.floor(num);
            return data;
        }
    }
}