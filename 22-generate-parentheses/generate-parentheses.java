class Solution {
    public boolean isValid(StringBuilder curr){
        int sum=0;
        for(int i=0;i<curr.length();i++){
            if(curr.charAt(i)=='('){
                sum++;
            }
            else{
                sum--;
            }
        if(sum<0){
            return false;
        }
        }
        return sum==0;
    }
    public void solve(StringBuilder curr, List<String> res, int n){

        if(curr.length()==2*n){
            System.out.println(curr.toString());
            if(isValid(curr)){
            res.add(curr.toString());
            
            }
            return;
            
        }

        curr=curr.append('(');
        solve(curr, res,n);
        curr.deleteCharAt(curr.length()-1);

        curr=curr.append(')');
        solve(curr, res,n);
        curr.deleteCharAt(curr.length()-1);
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder curr=new StringBuilder();

        List<String> res=new ArrayList<>();
        solve(curr,res,n);
        return res;
    }
}