class Solution {
    public String smallestNumber(String pattern) {
        String res="";
        Stack<Integer> stck=new Stack<>();
        int count=1;

        for(int i=0;i<=pattern.length();i++){
            stck.push(count);
            count++;

            if(i==pattern.length() || pattern.charAt(i)=='I'){
                while(!stck.isEmpty()){
                res=res+stck.pop();
                }
            }
        }
        while(!stck.isEmpty()){
            res=res+stck.pop();
        }

        
    return res;
    }
}