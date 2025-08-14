class Solution {
    public void solve(int idx,int [] nums, int n, List<Integer> temp,List<List<Integer>> res){
        if(idx>=n){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        solve(idx+1,nums,n,temp,res);
        temp.remove(temp.size()-1);
        solve(idx+1,nums,n,temp,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        solve(0,nums,n,new ArrayList<>(),res);
        return res;
    }
}