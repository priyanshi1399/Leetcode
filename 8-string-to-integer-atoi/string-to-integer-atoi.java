class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        double sum=0;
        int i=0;
        int sign=1;

        while(i<n  && s.charAt(i)==' '){
                i++; //white spaces
        }

        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign=s.charAt(i)=='-'?-1:1;
            i++; //read the sign
        }
      
        
        while(i<n && Character.isDigit(s.charAt(i))){
           sum=sum*10+s.charAt(i)-'0';
           i++;  //read the digit
        }

        if(sign==-1){
            sum=sum*-1; //check sign
        }
        sum= sum>=Integer.MAX_VALUE?Integer.MAX_VALUE:sum;
        sum= sum<=Integer.MIN_VALUE?Integer.MIN_VALUE:sum;
        return (int)sum; //check sum



    }
}