class Solution {
    public void swap(int x,int y,int [] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public void solve(int [] nums, int idx,List<List<Integer>> res,int n){
        if(idx==n){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(nums[i]);
            }
            res.add(new ArrayList<>(temp));
        }

        for(int i=idx;i<n;i++){
            swap(idx,i,nums); // do something
            solve(nums,idx+1,res,n); //explore
            swap(idx,i,nums); //undo

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        solve(nums,0,res,n);
        return res;
    }
}