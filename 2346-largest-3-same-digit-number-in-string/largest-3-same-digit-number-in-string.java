class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        int i=0;
        int maxValue=Integer.MIN_VALUE;
        String ans="";
        while(i<n){
            char ch=num.charAt(i);
            if((i+1<n && i+2<n) && ch==num.charAt(i+1) && ch==num.charAt(i+2)){
                String subPart=num.substring(i,i+3);
                if(Integer.parseInt(subPart)>maxValue){
                    maxValue=Integer.parseInt(subPart);
                    ans=subPart;
                }
               
            }
            i++;
        }
        return ans;
}
}