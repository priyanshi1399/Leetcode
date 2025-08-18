class Solution {
    Set<Integer> col=new HashSet<>();
    Set<Integer> diagonal=new HashSet<>();
    Set<Integer> antiDiagonal=new HashSet<>();
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

        for(int j=0;j<n;j++){
        if(col.contains(j) || diagonal.contains(row+j) || antiDiagonal.contains(row-j)){
            continue; //if those values already exists in set
        }
        board[row][j]='Q';
        col.add(j);
        diagonal.add(row+j);
        antiDiagonal.add(row-j);
        backtrack(row+1,board,res,n);
        board[row][j]='.';
        col.remove(j);
        diagonal.remove(row+j);
        antiDiagonal.remove(row-j);

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