class Solution {
    public int maxProfit(int[] prices) {
        int minValue=prices[0];
        int cost=0;
        int profit=0;
        for(int i=1;i<prices.length;i++){
            cost=prices[i]-minValue;
            profit=Math.max(profit,cost);
            minValue=Math.min(minValue,prices[i]);
        }
        return profit;
    }
}