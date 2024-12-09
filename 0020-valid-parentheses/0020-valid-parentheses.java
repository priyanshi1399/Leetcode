class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
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
        return st.isEmpty();

    }
}