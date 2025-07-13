class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stck=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stck.push(ch);
            }
            else{
                if(stck.size()>0 && stck.peek()=='('){
                    stck.pop();
                }
                else{
                    stck.push(ch);
                }
            }
        }
        return stck.size();
    }
}

/*

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
*/