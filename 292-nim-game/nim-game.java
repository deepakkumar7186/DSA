class Solution {
    public boolean canWinNim(int n) {
        // return n % 4 != 0;
        if(n % 4 != 0){
            return true;
        }
        return false;
    }
}