class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int[] newarr = new int[n];
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            while(nums[i] != 0){
                sum = sum + nums[i]%10;
                nums[i] /= 10;
            }
            newarr[i] = sum;
            sum = 0;
        }
        int ans = newarr[0];
        for(int i = 0 ; i < nums.length ; i++){
            if(ans > newarr[i]){
                ans = newarr[i];
            }
        }
        return ans;
    }
}