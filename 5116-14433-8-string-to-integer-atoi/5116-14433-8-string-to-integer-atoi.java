class Solution {
    public int myAtoi(String s) {
        double sum=0;
        int i=0;
        int sign=1;

     
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        
      
        if(i<s.length() && s.charAt(i)=='+'){
            sign=1;
            i++;
        }
        else if(i<s.length() && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }

        while(i<s.length() && s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9 ){
           sum=10*sum+ s.charAt(i)-'0';
           i++;
        }
      
    
        if(sign==-1){
            sum=-1*sum;
        }
        sum=sum>=Integer.MAX_VALUE?Integer.MAX_VALUE:sum;
        sum=sum<=Integer.MIN_VALUE?Integer.MIN_VALUE:sum;
        return (int)sum;
    
    }
    
}