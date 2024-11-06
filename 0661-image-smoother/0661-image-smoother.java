class Solution {
    public int[][] imageSmoother(int[][] img) {
        int rows=img.length;
        int cols=img[0].length;
        int [][] res=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                res[i][j]=calculate(img,i,j,rows,cols);
            }
        }
        return res;
    }

    private int calculate(int [][] img, int i,int j, int rows,int cols){
        int top=Math.max(0,i-1); 
        int bottom=Math.min(rows,i+2);
        int left=Math.max(0,j-1);
        int right=Math.min(cols,j+2);
        int sum=0;                                  
        int count=0;
        for(int row=top;row<bottom;row++){
            for(int col=left;col<right;col++){
                sum=sum+img[row][col];
                count++;
            }
        }
        return sum/count;

    }
}