class Solution {
    public double Power(double x,long n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }

        if(n%2!=0){
            return x* Power(x,n-1);
        }
        return  Power(x*x, n/2);
        }
    public double myPow(double x, int n) {
        double ans=1;
        long nn=n;
        if(n<0){

            return ans/Power(x,-nn); //niche jake power positive me kar k result 2^-3==>1/8
        }

        return Power(x,nn);



        /*double ans=1;
        long nn=n;  //taken because number is out of range
        if(nn<0){
            x=1/x;
            nn=-1*nn;
        }
        if(nn==0){
            return 1;
        }
        while(nn>0){
            if(nn%2!=0) {//it is odd{
                ans=ans*x; //multiplied in ans 2^49 2* 2^48
                nn=nn-1;
            }
            else{
                x=x*x; //2^48 =>(2^2)^24
                nn=nn/2;
            }
        }
        return ans;*/

        /*if(n==0){
            return 1;
        }
        if(n<0){
          x=1/x;
          n=-1*n;
        }
        double ans=1;
        for(int i=1;i<=n;i++){
            ans*=x;
        }
        return ans;*/ //Time Limit Exceeded



       
    }
}