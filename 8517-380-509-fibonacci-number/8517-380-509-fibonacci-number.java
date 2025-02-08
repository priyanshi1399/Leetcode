class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        /*
        n=4
        i=2
        a=0 b=1 c=1
        i=3
        a=1 b=1 c=2
        i=4
        a=1 b=2 c=3
        a=2 b=3 c=3 at the end b and c will have same value retunr any one.
        */
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<n+1;i++){
        c=a+b;
        a=b;
        b=c;
        }
        return c;
    }
}

/*public int fib(int n) {
    int [] dp=new int[n+1];
    if(n<=0){
        return 0;
    }
    dp[0]=0;
    dp[1]=1;

    for(int i=2;i<n+1;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
}
}*/
    /*public int fib(int n) {
    
    int [] dp=new int[n+1];
    return helper(dp,n);      
}
private int helper(int [] dp,int n){
    if(n<=1){
        return n;
    }
    if(dp[n]!=0){
        return dp[n];
    }
    dp[n]=helper(dp,n-1)+helper(dp,n-2);
    return dp[n];
}

}*/