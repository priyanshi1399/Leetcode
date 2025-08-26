class Solution {
    int n;
    public void solve(int idx,int [] nums,List<List<Integer>> res, List<Integer> temp){
        res.add(new ArrayList<>(temp));

        for(int i=idx;i<n;i++){
            if(i>idx && nums[i]==nums[i-1]){ //for the same element check
                continue; //skip same element 
            }
            temp.add(nums[i]); //include the element
            solve(i+1,nums,res,temp); //explore 
            temp.remove(temp.size()-1); //remove the element and explore
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        n=nums.length;
        Arrays.sort(nums); //sort the array so that similar index come together
        List<List<Integer>> res=new ArrayList<>(); //list 
        solve(0,nums,res,new ArrayList<>()); //recursive function to add 
        return res;
    }
}