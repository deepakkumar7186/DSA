class Solution {
    public int maxProfit(int[] prices) {
        int val = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < prices.length ; i++){
            if (prices[i] < min) {
                min = prices[i]; 
                // idx = i;
            }
            int profit = prices[i] - min;
            if (profit > val) {
                val = profit;
            }
        }
        
        return val;
    }
}