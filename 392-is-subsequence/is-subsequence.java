class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i == s.length();


        // int start = 0; 
        // int end = t.length() - 1;
        // int count = 1;
        // if(s.length() == 0){
        //     return true;
        // }
        // for(int i = 0 ; i < s.length() ; i++){
        //     while(start < end){
        //         if(s.charAt(i) == t.charAt(start) || s.charAt(i) == t.charAt(end)){
        //             count++;
        //             // if(count == s.length()) return true;
        //             start++;
        //             end--;
        //             break;
        //         }
        //         start++;
        //         end--;
        //     }
        // }
        // if(count == s.length()){
        //     return true;
        // }
        // return false;
    }
}