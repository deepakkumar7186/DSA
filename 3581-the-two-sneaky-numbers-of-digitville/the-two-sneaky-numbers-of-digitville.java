class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int idx = 0;

        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > 1 && idx < 2){
                boolean alreadyAdded = false;
                for(int k = 0; k < idx; k++){
                    if(arr[k] == nums[i]){
                        alreadyAdded = true;
                        break;
                    }
                }
                if(!alreadyAdded){
                    arr[idx] = nums[i];
                    idx++;
                }
            }
        }
        return arr;
    }
}
