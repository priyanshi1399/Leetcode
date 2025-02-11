class Solution {
    public String removeOccurrences(String s, String part) {
        int n=s.length();
        int m=part.length();
        Stack<Character> stck=new Stack<>();

        for(int i=0;i<n;i++){
            stck.push(s.charAt(i));
            if(stck.size()>=m && check(stck,part,m)){
               for(int j=0;j<m;j++){
                    stck.pop();
                }
               }
        }
            StringBuilder str=new StringBuilder();
            while(!stck.isEmpty()){
               str.append(stck.pop());
            }
            return str.reverse().toString();
    }

    public boolean check(Stack<Character> stck,String part,int m){
        Stack<Character> tempStack=new Stack<>();
        tempStack.addAll(stck);
        for(int i=m-1;i>=0;i--){
            if(tempStack.peek()!=part.charAt(i)){
                return false;
            }
            tempStack.pop();
        }
        return true;
    }
}
    /* public String removeOccurrences(String s, String part) {
        String result="";
        for(int i=0;i<s.length();i++){
            result=result+s.charAt(i);
            if(result.length()>=part.length()){
                if(result.substring(result.length()-part.length(),result.length()).equals(part)){
                    result=result.replace(result.substring(result.length()-part.length(),result.length()),"");
                }
            }
        }
        return result;

     }
}
*/
    /*public String removeOccurrences(String s, String part) {
           
        while(true){
            int index=-1;
            index=s.indexOf(part);
            if(index==-1){
                break;
            }

            s=s.substring(0,index)+s.substring(index+part.length() ,s.length());
        }
        return s;
    
}
}*/