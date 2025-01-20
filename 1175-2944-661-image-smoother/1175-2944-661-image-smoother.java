class Solution {
    public int[][] imageSmoother(int[][] img) {
        int row=img.length;
        int col=img[0].length;
        int [][] ans=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                //i will be ranging from i-1 to i+1
                //j will be ranging from j-1 to j+1
                int sum=0;
                int count=0;
                for(int x=-1 ;x<=1;x++){
                    for(int y=-1;y<=1;y++){
                        int rIndex=i+x;
                        int cIndex=j+y;

                        if(rIndex>=0 && rIndex<row && cIndex>=0 && cIndex<col){
                            sum=sum+img[rIndex][cIndex];
                            count++;
                        }
                    }
                }
                ans[i][j]=sum/count;
            }
        }
        return ans;
    }
}