class Solution {
    public String resultingString(String s) {
        int n=s.length();
        Stack<Character> stck=new Stack<>();
       // stck.push(s.charAt(0));
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!stck.isEmpty() && (Math.abs(stck.peek()-ch)==1 || Math.abs(stck.peek()-ch)==25)){
                stck.pop();
            }
            else{
                stck.push(ch);
            }
        }
        StringBuilder str=new StringBuilder();
        while(!stck.isEmpty()){
            str.append(stck.pop());
        }
        return str.reverse().toString();
        
    }
}