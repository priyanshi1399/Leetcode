class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int gasValue=0;
        int costValue=0;
        for(int i=0;i<n;i++){
            gasValue+=gas[i];
            costValue+=cost[i];
        }
        if(gasValue<costValue){
            return -1; //if gas is less how we will move?
        }
        int start=0; gasValue=0;
        for(int i=0;i<n;i++){
            gasValue=gasValue+gas[i]-cost[i];

            if(gasValue<0){
                start=i+1; //go to next Index
                gasValue=0;
            }
        }
        return gasValue>=0?start:-1; //positive value we will get index
    }
}