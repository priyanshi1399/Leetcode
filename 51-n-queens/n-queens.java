class Solution {
    List<List<String>> result=new ArrayList<>();
    public boolean isSafe(int row,int col,List<String> board,int n){
        //upward
        for(int i=row;i>=0;i--){
            if(board.get(i).charAt(col)=='Q'){
                return false;
            }
        }

        //upward left diagonal

        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }


        //upward right diagonal
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        return true;
    }
    public void solve(int row,List<String> board,int n){
        if(row==n){
            result.add(new ArrayList<>(board));
            return;
        }


        for(int col=0;col<n;col++){
            if(isSafe(row,col,board,n)){
                char [] charArray=board.get(row).toCharArray();
                charArray[col]='Q';
                String replaceString=new String(charArray);
                board.set(row,replaceString);//setting the value toString
                solve(row+1,board,n);
                charArray[col]='.'; //setting . because of backtracking
                replaceString=new String(charArray);
                board.set(row,replaceString);//setting the value toString
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
               
        List<String> board=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder curr=new StringBuilder();
            for(int j=0;j<n;j++){
                curr.append('.');
            }
            board.add(curr.toString());
        }

        solve(0,board,n);
        return result;
        
    }
}