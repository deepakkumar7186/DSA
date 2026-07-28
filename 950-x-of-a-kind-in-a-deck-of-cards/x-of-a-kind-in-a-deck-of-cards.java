import java.util.Arrays;
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);
        int gcd = 0;
        int count = 1;
        int prev = 0;
        for(int i = 0 ; i < deck.length-1 ; i++){
            if(deck[i] == deck[i+1]){
                count++;
            }
            else{
                gcd = gcd == 0 ? count : gcd(gcd, count);
                count = 1;
            }
        }
        gcd = gcd == 0 ? count : gcd(gcd, count);
        return gcd >= 2;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}