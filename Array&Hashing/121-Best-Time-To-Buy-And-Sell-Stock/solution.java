class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int minimumBuy = prices[0];
        for(int i = 1; i < prices.length; i++){
            int currProfit = prices[i] - minimumBuy;
            if(currProfit > maximumProfit){
                maximumProfit = currProfit;
            }
            if(prices[i] < minimumBuy){
                minimumBuy = prices[i];
            }
        }

        return maximumProfit;
    }
}