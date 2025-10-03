class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum=numBottles;
        int emptyBottles=numBottles;
        numBottles=0;
        while(emptyBottles>=numExchange){
            
            emptyBottles=emptyBottles-numExchange;
             sum++;
             emptyBottles++;
            numExchange++;
        }
        return sum;

    }
}