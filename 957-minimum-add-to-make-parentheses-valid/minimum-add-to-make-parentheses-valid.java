class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int close=0;
        Stack<Character> stck=new Stack<>();
       int i=0;
       while(i<n){
            char ch=s.charAt(i);
            if(ch=='('){
                stck.push(ch); 
            }
            else{
                if(ch==')' && !stck.isEmpty()){
                    stck.pop();
                }
                else if(ch==')' && stck.isEmpty()){
                    close++;
                } 
            }
            i++;
        }
        return close+stck.size();
    }
}