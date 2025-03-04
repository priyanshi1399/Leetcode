class Solution {
    public boolean solve(int n,int P){
        if(n==0){
            return true;
        }

        if(Math.pow(3,P)>n){
            return false;
        }

        boolean takePower=solve(n-(int)Math.pow(3,P),P+1);

        boolean notTakePower=solve(n,P+1);

        return takePower ||  notTakePower;

    }
    public boolean checkPowersOfThree(int n) {
        return solve(n,0);
    }
}