class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false;
            }
            charCount[c - 'a']--;
        }
        return true;
        // int n;
        // if(ransomNote.length() >= magazine.length()){
        //     n = magazine.length();
        // }
        // else{
        //     n = ransomNote.length();
        // }

        // for(int i = 0 ; i < n ; i++){
        //     if(ransomNote.charAt(i) != magazine.charAt(i)){
        //         return false;
        //     }
        // }
        // return true;
    }
}