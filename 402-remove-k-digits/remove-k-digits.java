class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character> stck=new Stack<>();
        if(n==k) return "0"; //if length and k is same return "0"
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
           while(!stck.isEmpty() && stck.peek()>ch && k>0){
                stck.pop(); //pop if found greater number on top
                k--;
           }
           if(!stck.isEmpty() || ch!='0'){ //if stack is Empty then ignore 0 else put
            stck.push(ch);
           }
        }
        String ans=""; //take String for result
        while(!stck.isEmpty() && k>0){
            stck.pop(); // if numbers are in increasing order remove from last
            k--;
        }
        while(!stck.isEmpty()){
                ans=stck.pop()+ans; //number will append from last e.g "200"
        }
        return ans.length()>0?ans:"0";
        
    }
}