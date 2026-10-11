class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int j = 0 ; j < nums.length ; j++){
            int i = j+1;

            if(n%i == 0){
                int val  = nums[j];
                sum += val * val;
            }
        }
        return sum;
    }
}