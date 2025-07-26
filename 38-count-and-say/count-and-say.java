class Solution {
    public String countAndAppend(String ans){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<ans.length();i++){
            int count=1;
            String num=String.valueOf(ans.charAt(i));
            while(i+1<ans.length() && ans.charAt(i)==ans.charAt(i+1)){
                count++;
                i++;
            }
            str.append(String.valueOf(count));
            str.append(num);

        }
        
        return str.toString();

    }
    public String solve(int n){
        if(n==1 || n==0){
            return "1";
        }

        String ans=solve(n-1);
        System.out.println(ans);
        return countAndAppend(ans);
       

    }
    public String countAndSay(int n) {
        return solve(n);
    }
}