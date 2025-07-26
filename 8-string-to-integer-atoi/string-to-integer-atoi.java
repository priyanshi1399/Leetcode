class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        double sum=0;
        int i=0;
        while(i<n  && s.charAt(i)==' '){
                i++;
        }

        int sign=1;
        if(i<n && s.charAt(i)=='+'){
                sign=1;
                i++;
        }
        else if(i<n && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
      
        
        while(i<n && Character.isDigit(s.charAt(i))){
           sum=sum*10+s.charAt(i)-'0';
           i++;
        }

        if(sign==-1){
            sum=sum*-1;
        }
        sum= sum>=Integer.MAX_VALUE?Integer.MAX_VALUE:sum;
        sum= sum<=Integer.MIN_VALUE?Integer.MIN_VALUE:sum;
        return (int)sum;



    }
}