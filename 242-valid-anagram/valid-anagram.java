class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);

        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        String sortedStr2 = new String(chars2);

        if(sortedStr.equals(sortedStr2)){
            return true;
        }
        else{
            return false;
        }
        
    }
}