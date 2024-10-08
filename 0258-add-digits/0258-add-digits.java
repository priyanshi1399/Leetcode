class Solution {
    
   
    public int addDigits(int num) {
       while(countNumberofDigit(num)>1){
        num=num1;
       }
       return num1;

    }
     int num1=0;
    public int countNumberofDigit(int num){
         int sum=0;
        int count=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
            count++;
        }
        num1=sum;
        return count;
    }
}