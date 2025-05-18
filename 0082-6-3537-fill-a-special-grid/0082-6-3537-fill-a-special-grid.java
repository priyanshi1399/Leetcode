class Solution {
    int val=0;
    public void solve(int [][] temp, int row,int col, int size){

        if(size==1){
            temp[row][col]=val;
            val++;
            return;
        }


        int s=size/2;

        solve(temp,row,col+s,s); //top right
        solve(temp,row+s,col+s,s); //bottom right
        solve(temp,row+s,col,s);//bottom-left
        solve(temp,row,col,s); //top left


    }
    public int[][] specialGrid(int n) {
        int size=1<<n;

        int [][] temp=new int[size][size];

        solve(temp,0,0,size);
        return temp;
    }
}