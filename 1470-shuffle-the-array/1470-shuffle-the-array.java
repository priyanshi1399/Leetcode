class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len=nums.length;
        int [] res=new int[len];
        for(int i=0;i<n;i++){
            res[i*2]=nums[i];
            res[2*i+1]=nums[n+i];
        }
        return res;
    }
}