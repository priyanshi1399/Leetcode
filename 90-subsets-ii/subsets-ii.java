class Solution {
    public void solve(int idx,int n,List<Integer> temp,int [] nums, List<List<Integer>> res){
       res.add(new ArrayList<>(temp)); //empty subset adding
       for(int i=idx;i<n;i++){
        if(i!=idx && nums[i]==nums[i-1]){
            continue; //skip the duplicates
        }
        temp.add(nums[i]); //add
        solve(i+1,n,temp,nums,res); //explore
        temp.remove(temp.size()-1); //undo
       }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);// duplicate will be together
        List<List<Integer>> res=new ArrayList<>();
        solve(0,n,new ArrayList<>(),nums,res);
        return res;

    }
}