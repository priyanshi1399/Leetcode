class Solution {
    public void swap(int x,int y,int [] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;

    }
    public  void solve(int idx, int [] nums,List<List<Integer>> res,int n){
        if(idx==n){
            List<Integer> temp=new ArrayList<>();
          for(int i=0;i<n;i++){
            temp.add(nums[i]);
          }
          res.add(temp);
          return;
        }
        for(int i=idx;i<n;i++){
            swap(i,idx,nums);
            solve(idx+1,nums,res,n);
            swap(i,idx,nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        solve(0,nums,res,n);
        return res;
    }
}