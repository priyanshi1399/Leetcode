class Solution {
    //here we need to match rowsum colsum diagonalSum,AntiDiagonalSum and no duplicates
    public boolean isMagicGrid(int r,int c,int [][] grid){
        //NoDuplicates

        if(NoDuplicates(r,c,grid) && RowSumColSumAndDiagonalCheck(r,c,grid) ){
            return true;
        } 
        return false;


    }
    public boolean NoDuplicates(int r,int c,int [][] grid){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int num=grid[r+i][c+j];
                if(num<1 || num>9 ||set.contains(num)){
                 return false;
                }
                else{
                    set.add(num);
                }
            }
        }
        return true;

    }

    public boolean RowSumColSumAndDiagonalCheck(int r,int c,int [][] grid){
      int RSum=grid[r][c]+grid[r][c+1]+grid[r][c+2];
      for(int i=0 ;i<3;i++){
            if(grid[r+i][c]+grid[r+i][c+1]+grid[r+i][c+2]!=RSum){
                return false; //Sum of the rows just imagin e r=0 c=1
            }
            if(grid[r][c+i]+grid[r+1][c+i]+grid[r+2][c+i]!=RSum){
                return false;
            }
      }
       if(grid[r][c] +grid[r+1][c+1]+grid[r+2][c+2]!=RSum){
                return false;
        }
        if(grid[r][c+2]+grid[r+1][c+1]+grid[r+2][c]!=RSum){
            return false;
        }
      return true;
    }

    public int numMagicSquaresInside(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int count=0;
        for(int i=0;i<=rows-3;i++){
            for(int j=0;j<=cols-3;j++){
                if(isMagicGrid(i,j,grid)){ //r=0 c=1 
                    count++;
                }
            }
        }
        return count;
    }
}