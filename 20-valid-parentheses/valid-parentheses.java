class Solution {
    public boolean isValid(String s) {
        //edge case when string is Empty
        if(s==""){
            return false;
        }
        if(s.length()%2!=0){ //odd length
            return false;
        }
        // First char is closing- return false
        if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']'){
            return false; //no match
        }

        Stack<Character> stck=new Stack<>();
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                stck.push(ch);
                continue;
            }

            if(stck.isEmpty()){
                return false; //only one match  ""(){}}{"
            }
            char check;
            switch(ch){
                case ')':
                check=stck.peek();
                if(check!='(') //not on the matching paraenthesis
                    return false;
                stck.pop();
                break;

                case '}':
                check=stck.peek();
                if(check!='{') //not on the matching paraenthesis
                    return false;
                stck.pop();
                break;

                case ']':
                check=stck.peek();
                if(check!='[') //not on the matching paraenthesis
                    return false;
                stck.pop();
                break;

            }

        }
        if(stck.isEmpty()){
            return true;
        }
        return false;

    }
}
//"(){}}{"