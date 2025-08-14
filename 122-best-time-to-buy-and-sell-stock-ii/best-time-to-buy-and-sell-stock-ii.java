class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxiProfit=0;
        int start=prices[0];
        for(int i=1;i<n;i++){
            if(start<prices[i]){
                maxiProfit+=(prices[i]-start);
            }
            start=prices[i];
        }
        return maxiProfit;

    }
}