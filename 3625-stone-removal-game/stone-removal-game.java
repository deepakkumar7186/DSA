class Solution {
    public boolean canAliceWin(int n) {
        int alice = 1;
        // int bob = 0;
        int stonesToRemove = 10;
        if(n < stonesToRemove){
            return false;
        }
        while(n >= stonesToRemove){
            if(alice == 1){
                n -= stonesToRemove;
                stonesToRemove--;
                alice = 0;
                if(n < stonesToRemove){
                    return true;
                }
            }
            else{ 
                n -= stonesToRemove;
                stonesToRemove--;
                alice = 1;
                if(n < stonesToRemove){
                    return false;
                }
            }
        }
        return false;
    }
}