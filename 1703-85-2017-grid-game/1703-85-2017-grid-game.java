class Solution {
    public long sum(int start,int end, int [][] grid){
        long total=0;
        for(int i=start;i<end;i++){
            total+=grid[0][i];
        }
        return total;
    }
    public long gridGame(int[][] grid) {
    
        long firstRowRemaining=sum(0, grid[0].length,grid); //row of first row
        System.out.println(firstRowRemaining);

        long secondRobotRemaining=0; //initially taking 0

        long minimizedRobotSum=Long.MAX_VALUE;
        //checking all possibility
        for(int firstRobotCol=0;firstRobotCol<grid[0].length;firstRobotCol++){
            firstRowRemaining=firstRowRemaining-grid[0][firstRobotCol];
            
            
            long bestOfRobot2=Math.max(firstRowRemaining,secondRobotRemaining); //e.g=>9,0 max(9)-->then 4,0 max(4)
            //minimizing the value
            
             secondRobotRemaining+=grid[1][firstRobotCol];

            minimizedRobotSum=Math.min(minimizedRobotSum,bestOfRobot2);      

        }

        return minimizedRobotSum;
    }
}