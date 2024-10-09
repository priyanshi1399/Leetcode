class Solution {
    public int alternateDigitSum(int n) {
       /* String s1=String.valueOf(n);
        StringBuilder s=new StringBuilder(s1);
        s.reverse();
        int n1=Integer.parseInt(s.toString());
        int sum=0;
        int count=0;
        while(n1!=0){
            int digit=n1%10;
            count++;
            if(count%2!=0){
                sum=sum+digit;
            }
            else{
                sum=sum-digit;
            }
            n1=n1/10;
        }
    return sum;    */

    String nums=Integer.toString(n);
    int sum=0;
    for(int i=0;i<nums.length();i++){
        if(i%2==0){
            sum+=(int)((nums.charAt(i))-'0');
        }
        else if(i%2!=0){
            sum-=(int)((nums.charAt(i))-'0');
        }
    }
    return sum;


    }
}