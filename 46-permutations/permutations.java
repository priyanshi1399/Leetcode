class Solution {

    public void solve(int n,int [] nums,List<List<Integer>> res,List<Integer> temp, HashSet<Integer> set){
        if(temp.size()==n){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                temp.add(nums[i]);
                solve(n,nums,res,temp,set);
                temp.remove(temp.size()-1);
                set.remove(nums[i]);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        solve(n,nums,res,new ArrayList<>(),new HashSet<>());
        return res;
    }
}