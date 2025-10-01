class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while((numBottles/numExchange)>0){
           
            int k=numBottles/numExchange;
            int m=numBottles%numExchange;
            sum=sum+k;
            numBottles=k+m;

        }
        return sum;
    }
}