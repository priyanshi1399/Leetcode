class Solution {
    public boolean isValid(String s) {
       /* {{[]}}({)*/
       Stack<Character> stack =new Stack<>();
       for(int i=0;i<s.length();i++){
       if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
        stack.push(s.charAt(i));
       }
       else if(s.charAt(i)==')' && !stack.empty() && stack.peek()=='('){
        stack.pop();
       }
        else if(s.charAt(i)=='}' && !stack.empty() && stack.peek()=='{'){
        stack.pop();
       }
        else if(s.charAt(i)==']' && !stack.empty() && stack.peek()=='['){
        stack.pop();
       }
       else{
        return false;
       }

    }
    return stack.empty();
     


       /* int n=s.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if(!stack.empty() && ch==')' && stack.peek()=='('){
                stack.pop();
            }
            else if(!stack.empty() && ch=='}' && stack.peek()=='{'){
                stack.pop();
            }
            else if(!stack.empty() && ch==']' && stack.peek()=='['){
                stack.pop();
            }
            else{
                return false;
            }
            
        }
    return stack.empty();*/


       /* Stack<Character> st=new Stack<Character>();
        HashMap<Character,Character> map=new HashMap<>();
       map.put(')','(');
       map.put('}','{');
       map.put(']','[');
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                if(!st.isEmpty() && st.peek()==map.get(s.charAt(i))){
                    st.pop();
                }
                else{
                    return false; //for single element
                }
            }

        }
        return st.isEmpty();*/

    }
}