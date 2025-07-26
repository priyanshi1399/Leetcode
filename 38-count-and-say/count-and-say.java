class Solution {
   

    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }

        String ans=countAndSay(n-1);
        StringBuilder str=new StringBuilder();
        for(int i=0;i<ans.length();i++){
            int count=1;
            char ch=ans.charAt(i);
            while(i+1<ans.length() && ans.charAt(i)==ans.charAt(i+1)){
                count++;
                i++;
            }
            str.append(count);
            str.append(ch);

        }
        
        return str.toString();

    }
}