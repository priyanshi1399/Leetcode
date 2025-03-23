class Solution {
        Set<Integer> diagonal=new HashSet<>();
        Set<Integer> antiDiagonal=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        List<List<String>> result=new ArrayList<>();
    private void solve(int row, List<String> board,int n){
        if(row>=n){
            result.add(new ArrayList<>(board));
            return;
        }

        for(int j=0;j<n;j++){
            if(diagonal.contains(row+j) || antiDiagonal.contains(row-j) || col.contains(j)){
                continue;
            }
            diagonal.add(row+j);
            antiDiagonal.add(row-j);
            col.add(j);
            StringBuilder temp=new StringBuilder(board.get(row));
            temp.setCharAt(j,'Q');
            board.set(row,temp.toString());
            solve(row+1,board,n);
            diagonal.remove(row+j);
            antiDiagonal.remove(row-j);
            col.remove(j);
            temp.setCharAt(j,'.');
            board.set(row,temp.toString());

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

        solve(0,board,n); //row is 0
        return result;
    }
}