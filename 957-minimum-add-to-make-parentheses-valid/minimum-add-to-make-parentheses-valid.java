class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                close++;
            }
            else if(close>0 && ch==')'){
                close--;
            }
            else{
                open++;
            }
        }
        return open+close;
    }
}