class Solution {
    int m;
    int n;
    private int [][] directions={{0,1},{0,-1},{1,0},{-1,0}};
    public boolean isSafe(int x,int y, char [][] board){
        if(x<0 || y<0 || x>=m || y>=n){
            return false;
        }
        return true;
    }
    public boolean solve(int x,int y,int index,char [][] board,String word,boolean [][] visited){
        if(index==word.length()-1){
            return true;
        }
        visited[x][y]=true;
        for(int [] dir: directions){
            int x_=x+dir[0];
            int y_=y+dir[1];

            if(isSafe(x_,y_,board) && !visited[x_][y_] &&  board[x_][y_]==word.charAt(index+1)){
                    if(!visited[x_][y_] && solve(x_,y_,index+1,board,word,visited)){
                        return true;
                    }
                }
        }
        visited[x][y]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        m=board.length;
        n=board[0].length;
        boolean [][] visited=new boolean [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(i,j,0,board,word,visited)){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
}