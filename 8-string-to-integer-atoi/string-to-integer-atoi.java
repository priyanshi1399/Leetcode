class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        double sum=0;
        int i=0;
        while(i<n  && s.charAt(i)==' '){
                i++;
        }

        int sign=1;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            else{
                sign=1;
            }
            i++;
        }
      
        
        while(i<n && Character.isDigit(s.charAt(i))){
           sum=sum*10+s.charAt(i)-'0';
           i++;
        }

        if(sign==-1){
            sum=sum*-1;
        }
        return (int)sum;


    }
}