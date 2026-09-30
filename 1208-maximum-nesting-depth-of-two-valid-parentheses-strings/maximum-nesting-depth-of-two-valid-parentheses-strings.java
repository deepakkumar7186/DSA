class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        int depth = 0;

        for(int i = 0 ; i < seq.length() ; i++){
            char c = seq.charAt(i);
            if(c == '('){
                res[i] = depth%2;
                depth++;
            }
            else{
                depth--;
                res[i] = depth%2;
            }
        }
        return res;
    }
}