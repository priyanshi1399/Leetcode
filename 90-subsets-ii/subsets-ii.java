class Solution {
    int n;
    public void solve(int idx,int [] nums,List<List<Integer>> res, List<Integer> temp){
        res.add(new ArrayList<>(temp));

        for(int i=idx;i<n;i++){
            if(i!=idx && nums[i]==nums[i-1]){
                continue; 
            }
            temp.add(nums[i]);
            solve(i+1,nums,res,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        solve(0,nums,res,new ArrayList<>());
        return res;
    }
}