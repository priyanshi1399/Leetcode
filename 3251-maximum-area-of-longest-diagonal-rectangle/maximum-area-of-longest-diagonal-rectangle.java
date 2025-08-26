class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int m=dimensions.length;
        int n=dimensions[0].length;
        int maxDiagonal=0;
        int area=0;
        for(int [] mat:dimensions){
            int length=mat[0];
            int breadth=mat[1];
            int diagonal=length*length+breadth*breadth;
            
            if(diagonal>maxDiagonal){
                maxDiagonal=diagonal;
                area=length*breadth;
            }
            else if(diagonal==maxDiagonal){
                maxDiagonal=diagonal;
                area=Math.max(area,length*breadth);
            }
        }
        return area;

    }
}