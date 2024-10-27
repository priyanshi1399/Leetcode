class Solution {
    public String largestOddNumber(String num) {
        int ind=-1;
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            return "";
        }
        int i=0;
        while(i<=ind && num.charAt(i)=='0'){
            i++;
        }
        return num.substring(i,ind+1);
        
    }
}