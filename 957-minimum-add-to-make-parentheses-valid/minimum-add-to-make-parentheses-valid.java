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
                    stck.pop(); //matched open nd close brackets
                }
                else if(ch==')' && stck.isEmpty()){
                    close++; //you can't find a match
                } 
            }
            i++;
        }
        return close+stck.size(); //left unmatched brackets+earlier closed ones left out
    }
}