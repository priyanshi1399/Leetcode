class Solution {
    private boolean DiffArrayByTechnique(int[] nums, int[][] queries, int index){
        int n=nums.length;
        int [] diff=new int[n];
        for(int i=0;i<=index;i++){
            int L=queries[i][0];
            int R=queries[i][1];
            int x=1;

            diff[L]+=x;
            if(R+1<n){
                diff[R+1]-=x;
            }

        }

        int cumSum=0;
        for(int i=0;i<n;i++){
            cumSum+=diff[i];
            diff[i]=cumSum;

            if(nums[i]-diff[i]>0){
                return false;
            }
        }
        return true;
    }
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int Q=queries.length;

        if(Arrays.stream(nums).allMatch(x-> x==0)){
            return true; //base case
        }

       int l=0;
       int r=Q-1;
       int result=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(DiffArrayByTechnique(nums,queries,mid)){
                result=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }    
        }
        if(result!=-1){
            return true;
        }
        return false;

       
    }
}