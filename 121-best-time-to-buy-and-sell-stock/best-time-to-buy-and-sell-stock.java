class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=0;
        int minValue=prices[0];
        for(int i=1;i<n;i++){
            
                maxProfit=Math.max(maxProfit,prices[i]-minValue); //4
            
            minValue=Math.min(prices[i],minValue);
        }
        return maxProfit;
    }
}