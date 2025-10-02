class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum=numBottles;
        int emptyBottles=numBottles;
        numBottles=0;
        while(numBottles+emptyBottles>=numExchange){
            if(emptyBottles<=numExchange){
                sum+=numBottles;
                emptyBottles+=numBottles;
                numBottles=0;
            }
            emptyBottles=emptyBottles-numExchange;
            numExchange++;
            numBottles++;
        }
        return sum+numBottles;

    }
}