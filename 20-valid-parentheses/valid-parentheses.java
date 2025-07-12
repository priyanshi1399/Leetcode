class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           if(!stck.isEmpty() && ch==']' && stck.peek()=='['){
                stck.pop();
           }
           else if(!stck.isEmpty()  && ch=='}' && stck.peek()=='{'){
                stck.pop();
           }
           else if(!stck.isEmpty() && ch==')' && stck.peek()=='('){
            stck.pop();
           }
           else if(ch=='(' || ch=='{' || ch=='[' ){
            stck.push(ch);
           }
           
           else{
            return false;
           }
        }
        if(stck.isEmpty()){
            return true;
        }
        return false;
    }
}