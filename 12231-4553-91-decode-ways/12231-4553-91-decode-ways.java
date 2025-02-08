class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        if(n==1){
            return s.charAt(0)=='0'?0:1;
        }

        if(s.charAt(0)=='0'){
            return 0;
        }

        int last1=1;
        int last2=1;
        int count=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i)!=0){
                count=s.charAt(i)!='0'?last1:0;
            }

            if(s.charAt(i-1)=='1' || s.charAt(i-1)=='2' && s.charAt(i)<'7'){
                count+=last2;
            }

            last2=last1;
            last1=count;
        }
        return last1;

    }
}
    /*public int numDecodings(String s) {
        int n=s.length();
        int [] dp=new int[n+1];

        dp[0]=1;
        dp[1]=s.charAt(0)=='0'?0:1;

        for(int i=2;i<n+1;i++){

            if(s.charAt(i-1)!='0'){
                dp[i]+=dp[i-1];
            }

            if(s.charAt(i-2)=='1' || s.charAt(i-2)=='2' && s.charAt(i-1)<'7'){
                dp[i]+=dp[i-2];
            }
        }

        return dp[n];


    }
}
*/
   /* public int numDecodings(String s) {
        int n=s.length();
        int [] dp=new int[n+1];

        dp[n]=1;

        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                dp[i]=0;
            }
            else{
            dp[i]=dp[i+1];
            if(i<n-1){
            if( s.charAt(i)=='1' || s.charAt(i)=='2' && s.charAt(i+1)<='6'){
                dp[i]+=dp[i+2];
            }
        }
        }
        }

        return dp[0];
    }
}
*/

    /*public int numDecodings(String s) {
        int [] dp=new int[101];
        Arrays.fill(dp,-1);
        int n=s.length();
        return solve(0,s,n,dp);
    }

    public int solve(int i,String s,int n,int [] dp){
        
        if(dp[i]!=-1){
            return dp[i];
        }
        if(i==n){
            return dp[i]=1;
        }

        if(s.charAt(i)=='0'){
            return dp[i]=0;
        }

        int result=solve(i+1,s,n,dp);
        if(i+1<n){
        if(s.charAt(i)=='1' || (s.charAt(i)=='2' && s.charAt(i+1)<='6')){
        result+=solve(i+2,s,n,dp);
        }
        }
        return dp[i]=result;
    }
}*/