class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numExchange>numBottles){
            return numBottles;
        }
        int bottle=numBottles;
        int sum=numBottles;
        while(bottle>=numExchange){
            int exchange=bottle/numExchange;
            sum+=exchange;
            
            bottle=exchange+(bottle%numExchange);
        }
        return sum;
    }
}