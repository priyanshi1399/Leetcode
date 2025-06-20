// User function Template for Java

class Solution {
    private final int mod=10_00_00;
    int minimumMultiplications(int[] arr, int start, int end) {
        int n=arr.length;
        if(start==end){
            return 0;
        }
        int [] res=new int[mod];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[start]=0;
        
        Queue<int []> q=new LinkedList<>();
        q.add(new int []{0,start});
        while(!q.isEmpty()){
            int [] curr=q.poll();
            int steps=curr[0];
            int node=curr[1];
            if(node==end){
                return steps;
            }
            for(int i=0;i<n;i++){
                int num=(node * arr[i])%mod;
                
                if(num==end){
                    return steps+1;
                }
                
                if(steps+1<res[num]){
                    q.add(new int []{steps+1,num});
                    res[num]=steps+1;
                }
            }
        }
        return -1;
        
    }
}
