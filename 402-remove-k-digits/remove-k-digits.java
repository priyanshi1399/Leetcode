class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character> stck=new Stack<>();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++){
            while(!stck.isEmpty() && stck.peek()>num.charAt(i) && k>0){
                stck.pop();
                k--;
            }

            if(!stck.isEmpty() || num.charAt(i)!='0'){
                stck.push(num.charAt(i));
            }
        }

        //if few elements left //123456 
        while(!stck.isEmpty() && k>0){
            stck.pop();
            k--;
        }

        while(!stck.isEmpty()){
            result.append(stck.pop());
        }
        return result.length()>0?result.reverse().toString():"0";
    
    }
}