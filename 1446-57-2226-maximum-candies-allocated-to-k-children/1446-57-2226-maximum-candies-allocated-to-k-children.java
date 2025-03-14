class Solution {
    public boolean canDistributeCandies(int [] candies,long k,long mid){
        int total=0;
        for(int i=0;i<candies.length;i++){
            k-=candies[i]/mid;
            
            if(k<=0){
                return true; //early return;
            }
        }
        if(k<=0){
            return true;
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int n=candies.length;
        long sum=0;
        int maxC=0;
        for(int i=0;i<n;i++){
            maxC=Math.max(maxC,candies[i]);
            sum+=candies[i];
        }

        if(sum<k){
            return 0;
        }
        
        int l=1;
        int r=maxC;
        int result=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(canDistributeCandies(candies,k,mid)){
                result=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return result;

        
    }
}