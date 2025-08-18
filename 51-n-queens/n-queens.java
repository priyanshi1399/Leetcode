class Solution {
    public boolean isSafe(int row,int col,char[][] board,int n){

        //check for column
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false; // we can't place the queen
            }
        }


        //check for upper right diagonal (row-- col++)
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //check for left diagonal (row--,col--)
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;


    }
    public List<String> addPath(char [][] board){
        List<String> path=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            path.add(new String(board[i]));
        }
        return path;
    }
    public void backtrack(int row,char [][] board, List<List<String>> res,int n){
        if(row==n){
            res.add(addPath(board));
            return;
        }


        for(int col=0;col<n;col++){
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';
                backtrack(row+1,board,res,n);
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char [][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        backtrack(0,board,res,n);
        return res;

    }
}