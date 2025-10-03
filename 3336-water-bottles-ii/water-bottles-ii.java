class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum=numBottles;
        int emptyBottles=numBottles;
        numBottles=0;
        while(emptyBottles>=numExchange || numBottles!=0){
            if(emptyBottles<numExchange){
                sum+=numBottles;
                emptyBottles+=numBottles;
                numBottles=0;
            }
            else{
            emptyBottles=emptyBottles-numExchange;
            numExchange++;
            numBottles++;
            }
        }
        return sum;

    }
}