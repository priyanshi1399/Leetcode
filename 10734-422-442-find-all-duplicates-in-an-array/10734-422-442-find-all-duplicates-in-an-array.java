class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=Math.abs(nums[i]);
            int idx=num-1;
            if(nums[idx]<0){
                ans.add(idx+1);
            }
            else{
            nums[idx]=(-1)*nums[idx];
            }
        }
        return ans;
    }
}



