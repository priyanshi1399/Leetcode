class Solution {
    public boolean isValid(String curr){
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
    public void solve(String curr, List<String> res, int n){

        if(curr.length()==2*n){
            System.out.println(curr);
            if(isValid(curr)){
            res.add(curr.toString());
            
            }
            return;
            
        }

        curr=curr+"(";
        solve(curr, res,n);
        curr=curr.substring(0,curr.length()-1);

        curr=curr+")";
        solve(curr, res,n);
        curr=curr.substring(0,curr.length()-1);
      
    }
    public List<String> generateParenthesis(int n) {
        String curr="";

        List<String> res=new ArrayList<>();
        solve(curr,res,n);
        return res;
    }
}