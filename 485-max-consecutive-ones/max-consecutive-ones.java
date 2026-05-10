class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_c = 0;
        int terms = 0;
        int idx = 0;

        for(int num: nums){
            if(num == 1){
                terms += 1;
                // max_c = max_c + terms;
                max_c = Math.max(max_c, terms);
            }
            else{
                // if(terms > idx){
                //     idx = terms;
                // }
                terms = 0;
                // max_c = 0;
                
            }
        }
        return max_c;
    }
}