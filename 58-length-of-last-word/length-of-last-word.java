class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int maxLen = 0;
        int len = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                // if(maxLen < len){
                //     maxLen = len;
                // }
                len = 0;
            }
            else{
                len++;
            }
        }
        return len;
    }
}