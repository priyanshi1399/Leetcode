class Solution {
    public boolean isValid(StringBuilder curr){
        int sum=0;
        for(int i=0;i<curr.length();i++){
            if(sum<0){
                return false;
            }
            if(curr.charAt(i)=='('){
                sum++;
            }
            else{
                sum--;
            }
        }
        return sum==0;
    }
    public void solve(List<String> res, StringBuilder curr, int n){
        if(curr.length()==2*n){
            if(isValid(curr)){
                res.add(curr.toString());
            }
            return;
        }

        curr.append('(');
        solve(res,curr,n);
        curr.deleteCharAt(curr.length()-1);
        curr.append(')');
        solve(res,curr,n);
        curr.deleteCharAt(curr.length()-1);
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder curr=new StringBuilder();
        List<String> res=new ArrayList<>();
        solve(res,curr,n);
        return res;
    }
}