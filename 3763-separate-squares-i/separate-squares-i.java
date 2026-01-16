class Solution {
    public boolean check(double midY,int [][] squares,double totalArea){
        double bottomArea=0.0;

        for(int [] square:squares){
        double y=square[1];
        double l=square[2];

        double bottomY=y;
        double topY=y+l;

        if(midY>=topY) {//midY is somewhere above top
        bottomArea+=l*l;
        }
        else if(midY>bottomY){
            bottomArea+=(midY-bottomY)*l;
        }
        }
        return bottomArea>=totalArea/2.0;
    }
    public double separateSquares(int[][] squares) {
        double low=Double.MAX_VALUE;
         double high=-Double.MAX_VALUE;
         double total=0.0;

        for(int [] sq:squares){
            double y=sq[1];
            double l=sq[2];

            total+=l*l;
            low=Math.min(low,y);
            high=Math.max(high,y+l);


        }
        double resultY=0.0;
        while(high-low > 1e-5){
        double midY=low+(high-low)/2.0;
         resultY=midY;
        if(check(midY,squares,total)){
            high=midY; //why not midY-1 midY+1 precision error
        }
        else{
            low=midY;
        }
        }
        return resultY;
       
    }
}