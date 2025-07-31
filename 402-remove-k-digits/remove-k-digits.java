class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Integer> stck=new Stack<>();
        int i=0;
        while(i<n){
            while(!stck.isEmpty() && stck.peek()>num.charAt(i)-'0' && k>0){
                    stck.pop();
                    k--;
            }
                if(!stck.isEmpty() || num.charAt(i)-'0'!=0){
                  stck.push(num.charAt(i)-'0');
                 }
                 i++;
            }
        

            StringBuilder str=new StringBuilder();
            while(!stck.isEmpty() && k>0){ //special case where elements in stck and k is also left
                    stck.pop();
                    k--;
            }
            while(!stck.isEmpty()){
                    str.append(stck.pop());
            }
            return str.length()==0?"0":str.reverse().toString();
    }
}