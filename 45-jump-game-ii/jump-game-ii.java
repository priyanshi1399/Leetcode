class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int l=0,r=0,jump=0;
        while(r<n-1){
            int farthest=Integer.MIN_VALUE;
            for(int idx=l;idx<=r;idx++){
                farthest=Math.max(farthest,idx+nums[idx]);
            }
            l=r+1;
            r=farthest;
            jump=jump+1;
        }
        return jump;
    }
}