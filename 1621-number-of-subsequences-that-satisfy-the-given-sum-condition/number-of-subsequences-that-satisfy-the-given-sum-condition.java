class Solution {
    private static final int mod=10_00_00_00_07;
    public int numSubseq(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0;
        int r=n-1;
        int ways=0;
        int [] power=new int[n]; //to compute power Precomputation
        power[0]=1;
        for(int i=1;i<n;i++){
            power[i]=(power[i-1]*2)%mod;
        }
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                int diff=r-l; //numbers
                ways=(ways+(power[diff]))%mod; //that many ways 
                l++;
            }
            else{
                r--;
            }
        }
        return ways;
    }
}