class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        int subarr;
        for(int i = 0 ; i < nums.length ; i++){
            // if(nums[i] == target){
            //     count += 1;
            // }
            int targetCount = 0;
            for(int j = i ; j < nums.length ; j++){
                if (nums[j] == target) {
                    targetCount++;
                }
                int length = j - i + 1;
                if (targetCount > length / 2) {
                    count++;
                }
            }
        }
        // if(count == 0){
        //     return 0;
        // }
        // else{
        //     subarr = count*(count+1);
        //     subarr /= 2;
        //     return subarr;
        // }
        return count;
    }
}