public class Solution {
    public double MyPow(double x, int n) {
        long nn=n;
        double ans=1.0;
            if(nn<0){
            nn=nn*-1;
            }
            while(nn>0){
            if(nn%2==0){
                x=x*x;
                nn=nn/2;
            }
            else{
                ans=ans*x;
                nn=nn-1;
            }
        }
        if(n<0){
            ans=(double)(1.0)/(double)(ans);
            return ans;
        }
        return ans;
    }
}