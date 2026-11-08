class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            int n = s.charAt(i);
            String str = String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
            sb.append(str);
        }
        int i = 0;
        int j = sb.length()-1;
        while(i < j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}