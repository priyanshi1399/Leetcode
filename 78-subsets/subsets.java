class Solution {
    public void solve(int idx,int [] nums, int n, List<Integer> temp,List<List<Integer>> res){
        if(idx>=n){ //index reaches till length
            res.add(new ArrayList<>(temp)); //add into final list
            return; 
        }

        temp.add(nums[idx]); //do add
        solve(idx+1,nums,n,temp,res); //explore to next index
        temp.remove(temp.size()-1); //remove other element
        solve(idx+1,nums,n,temp,res); //explore after removing the element
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        solve(0,nums,n,new ArrayList<>(),res);
        return res;
    }
}