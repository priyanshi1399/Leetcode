class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1){
            return false;
        }
        int sum=1; //1 will always be there
        for(int i=2;i*i<=num;i++) //can use Math.sqrt() but it will take some more time than this
        {
            if(num%i==0){
                sum=sum+i;
                if(i!=(num/i)){
                    sum=sum+(num/i);
                }
            }
        }
        return (sum==num);

    }
}