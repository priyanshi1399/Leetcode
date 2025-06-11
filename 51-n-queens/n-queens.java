class Solution {
     Set<Integer> cols=new HashSet<>();//J
        Set<Integer> diag=new HashSet<>(); //row+j
        Set<Integer> antidiag=new HashSet<>(); //row-j
        List<List<String>> result=new ArrayList<>();
    public void solve(int row,List<String> board,int n){
        if(row>=n){
            result.add(new ArrayList<>(board));
            return;
        }

        for(int j=0;j<n;j++){
            
            if(cols.contains(j) || diag.contains(row+j) || antidiag.contains(row-j)){
                continue;
            }
            cols.add(j);
            diag.add(row+j);
            antidiag.add(row-j);

            char [] charArray=board.get(row).toCharArray();
            charArray[j]='Q';
            String replace=new String(charArray);
            board.set(row,replace);
            solve(row+1,board,n);
            cols.remove(j);
            diag.remove(row+j);
            antidiag.remove(row-j);
            charArray[j]='.';
            replace=new String(charArray);
            board.set(row,replace);
           
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