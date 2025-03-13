class Solution {
    private boolean AlreadyZeroPresent(int [] nums){
       for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            return false;
            }
       }
       return true;
    }
    private boolean DiffreneceArrayTechnique(int [] nums,int [][] queries,int k){
        int n=nums.length;
        int [] diff=new int[n];
        for(int i=0;i<=k;i++){
        int L=queries[i][0];
        int R=queries[i][1];
        int x=queries[i][2];

        diff[L]+=x;
        if(R+1<n)
        diff[R+1]-=x;
        }

        int cumuSum=0; //cumuSum
        for(int i=0;i<n;i++){
            cumuSum+=diff[i];
            diff[i]=cumuSum;

            if(nums[i]-diff[i]>0){
                return false;
            }
        }
        return true;

    }
    public int minZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int q=queries.length;

        if(AlreadyZeroPresent(nums)){
            return 0;
        }

        int l=0;
        int r=q-1;
        int k=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(DiffreneceArrayTechnique(nums,queries,mid)){
                k=mid+1; //possible answer
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return k;
    }
}