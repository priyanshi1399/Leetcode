class Solution {
    public void solve(StringBuilder curr, List<String> res, int n ){


        if(curr.length()==n){
            res.add(curr.toString());
            return;
        }

        for(char ch='a';ch<='c';ch++){
            if(curr.length()>=1 && curr.charAt(curr.length()-1)==ch){
                continue;
            }

            curr.append(ch);
            solve(curr,res,n);
            curr.deleteCharAt(curr.length()-1);

        }
    }
    public String getHappyString(int n, int k) {
        List<String> res=new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        solve(curr,res,n);
        
        if(k>res.size()){
            return "";
        }
        return res.get(k-1);


    }
}