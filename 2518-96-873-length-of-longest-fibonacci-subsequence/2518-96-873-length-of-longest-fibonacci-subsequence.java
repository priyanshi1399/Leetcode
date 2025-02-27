class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        int [][] dp=new int[n][n];
        for(int [] row: dp){
            Arrays.fill(row,2);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        int maxLength=0;
        for(int  j=1;j<n;j++){
            for(int k=j+1;k<n;k++){
                int target=arr[k]-arr[j];
                if(map.containsKey(target) && map.get(target)<j){
                    int i=map.get(target);
                        dp[j][k]=dp[i][j]+1;
                    }
                maxLength=Math.max(maxLength,dp[j][k]);
            }
        }
        return (maxLength>=3)?maxLength:0;
    }
}
    /*public int solve(int j,int k,int [] arr, HashMap<Integer,Integer> map, int [][] dp){
        if(dp[j][k]!=-1){
            return dp[j][k];
        }
        int target=arr[k]-arr[j];
        if(map.containsKey(target) && map.get(target)<j){
            int i=map.get(target);
            return dp[j][k]=solve(i,j,arr,map,dp)+1; // 1 for Kth element
        }
        return dp[j][k]=2;
    }
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        int [][] dp=new int[n+1][n+1];
        for(int [] row: dp){
            Arrays.fill(row,-1);
        }
        int len=0;
        int result=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }

        for(int j=1;j<n;j++){
            for(int k=j+1;k<n;k++){
            len = solve(j,k,arr,map,dp);
            if(len>=3){
            result=Math.max(result,len);
            }
        }
        }
        return result;
    }   
}*/