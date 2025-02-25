class Solution {
    public void solve(StringBuilder curr, List<String> res, int n,int close,int open){

        if(curr.length()==2*n){
            System.out.println(curr.toString());

            res.add(curr.toString());
            
            
            return;
            
        }
        if(open<n){
        curr=curr.append('(');
        solve(curr, res,n,close,open+1);
        curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
        curr=curr.append(')');
        solve(curr, res,n,close+1,open);
        curr.deleteCharAt(curr.length()-1);
    }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder curr=new StringBuilder();
        int open=0;
        int close=0;
        List<String> res=new ArrayList<>();
        solve(curr,res,n,close,open);
        return res;
    }
}