class Solution {
    public int xorOperation(int n, int start) {
        int i = 1;
        int XOR = start;
        while(n != i){
            XOR = XOR ^ start+2;
            start += 2;
            i++;
        }
        return XOR;
    }
}