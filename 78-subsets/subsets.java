class Solution {
    int n;
    public void solve(int idx,int [] nums,List<Integer> temp,List<List<Integer>> res){
        if(idx>=n){
            res.add(new ArrayList<>(temp));
            return;
        }


        temp.add(nums[idx]);
        solve(idx+1,nums,temp,res);
        temp.remove(temp.size()-1);
        solve(idx+1,nums,temp,res);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        solve(0,nums,new ArrayList<>(),res);
        return res;
    }
}