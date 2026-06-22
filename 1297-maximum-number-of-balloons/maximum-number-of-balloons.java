class Solution {
    public int maxNumberOfBalloons(String text) {
        // int count = 0;
        int b = 0 , a = 0 , l = 0 , o = 0 , n = 0;
        
        for(int i = 0 ; i < text.length() ; i++){
            char itm = text.charAt(i);
            if(itm == 'b'){
                b++;
            }
            else if(itm == 'a'){
                a++;
            }
            else if(itm == 'l'){
                l++;
            }
            else if(itm == 'o'){
                o++;
            }
            else if(itm == 'n'){
                n++;
            } 

        }
        l /= 2;
        o /= 2;
        // int fre = 0;
        // if(b == a && a == l && l == o && o == n){
        //     fre = b;
        // }
        // return fre;
        return Math.min(Math.min(b, a), Math.min(l, Math.min(o, n)));
    }
}