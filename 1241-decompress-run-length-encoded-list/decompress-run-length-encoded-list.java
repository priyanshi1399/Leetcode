class Solution {
    public void insertElementtoArray(int [] nums, int [] ans){
        int j=0;
        int n=nums.length;
        for(int i=0;i<n;i+=2){
            int index=nums[i];
            int val=nums[i+1];
            while(index>0){
                ans[j]=val;
                j++;
                index--;
            }
        }
    }
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        int size=0;
        for(int i=0;i<n;i+=2){
            size+=nums[i];
        }
        int [] ans=new int[size];
        insertElementtoArray(nums,ans);

        return ans;
    }
}