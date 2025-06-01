class Solution {
    public boolean solve(int idx,int n, int [] nums, long target,long prod1, long prod2){
        if( idx>=n){
            if(prod1==target && prod2==target){
                return true;
            }
            return false;
        }

    
        boolean take=solve(idx+1,n,nums,target,prod1*nums[idx],prod2);

        boolean not_take=solve(idx+1,n,nums,target,prod1,prod2*nums[idx]);

        return take|| not_take;
    }
 
    public boolean checkEqualPartitions(int[] nums, long target) {
        int n=nums.length;
        
        return solve(0,n,nums,target,1,1);
    }
}