class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        // int max = 0;
        // int idx = 0;
        int val = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i]; 
                // idx = i;
            }

            int profit = prices[i] - min;
            if (profit > val) {
                val = profit;
            }
        }
        

        // for(int i = idx ; i < prices.length ; i++){
        //     if(prices[i] > max){
        //         max = prices[i];
        //     }
        // }
        // val = max - min;
        return val;
    }
}