class Solution {
    int m;
    int n;
    private static final int  [][] direction={{-1,0},{1,0},{0,1},{0,-1}};
    public boolean isSafe(int x,int y,int m,int n,char [][] board){
        if(x<0 || y<0 || x>=m || y>=n){
                return false;
        }
        return true;
    }
    public boolean solve(int x,int y,int index,char [][] board,int len,String word){
        if(index == word.length() - 1) {
            return true;
        }
        char temp=board[x][y];
        board[x][y]='$';
        for(int [] dir:direction){
            int x_=x+dir[0];
            int y_=y+dir[1];

            if((isSafe(x_,y_,m,n,board)) && (board[x_][y_]!='$') && (board[x_][y_]==word.charAt(index+1))){
                if(board[x_][y_]!='$' && solve(x_,y_,index+1,board,len, word)){
                    board[x][y]='$';
                    return true;
                }
            }


        }
        board[x][y]=temp;
        return false;


    }

    public boolean exist(char[][] board, String word) {
        m=board.length;
        n=board[0].length;
        int len=word.length();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(i,j,0,board,len,word)){
                        return true;
                    }
                        
                }
            }
        }
        return false;
    }
}