class Solution {

    public int buyChoco(int[] prices, int money) {
       /* int n=prices.length;
        int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){ 
            int sum=0;
            sum=sum+prices[i]+prices[j];
            if(sum<min){
                min=sum;
            }         
        }
    }
            if(min<=money){
                return money-min;
            }
        
        return money;*/

        Arrays.sort(prices);
        int sum=prices[0]+prices[1];
        if(sum<=money){
            return money-sum;
        }
        else{
            return money;
        }
    }
}