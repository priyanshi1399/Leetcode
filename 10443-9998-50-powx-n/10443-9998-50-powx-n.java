class Solution {
    public  double calculatePower(double x,long n){
        
        if(n==0){
            return 1;
        }

        if(n<0){
            return calculatePower(1/x, -n);
        }
        if(n%2==0){
           return calculatePower(x*x,n/2);
        }
        
            return x* calculatePower(x*x,n/2);
       
    }
    public double myPow(double x, int n) {
        
        double ans=calculatePower(x,(long)n);
        return ans;
    }
}