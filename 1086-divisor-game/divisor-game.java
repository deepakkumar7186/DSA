class Solution {
    public boolean divisorGame(int n) {
        // x -> Alice
        // y -> Bob
        int x = 0;
        boolean ali = false;
        int y = 0;
        boolean bob = false;

        if(n == 0 || n == 1){
            return false;
        }
        if(n%2 == 0){
            return true;
        }

        // for(int i = 0 ; i < n ; i++){
        //     if(x % 2 == 1){
        //         x++;
        //         ali = true;
        //         bob = false;
        //     }
        //     else{
        //         y++;
        //         ali = false;
        //         bob = true;
        //     }
        // }
        // return ali;
        else{ 
            return false;
        }
    }
}