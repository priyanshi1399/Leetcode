class Solution {

    public void generateAllPaths(int ind,String s,int open,int close,List<String> res,int n){
        if(open>n){
            return; 
        }
        if(open+close==2*n && open==close){
            res.add(s);
            return;
        }

        if(open<n){
        generateAllPaths(ind+1,s+'(',open+1,close,res,n);
        }

        if(open>close){
        generateAllPaths(ind+1,s+')',open,close+1,res,n);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        //int open=0;
        //int close=0;
        //String s="";

        generateAllPaths(0,"",0,0,res,n);
        return res;

    }
}
/* 1 -() -P=1
2-()() ,(()) P=2
3-()()() ,((())), ()(()), (())(),(()())  P-5
4-()()()(),(((()))), ()()(()), ()(())(),(())()(),((()())),((())()), (()(())) ,((()))(),()((())),(()()())*/