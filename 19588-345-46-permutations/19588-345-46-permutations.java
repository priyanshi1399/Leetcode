class Solution {
    public void solve(List<Integer> temp,int [] nums,int n,HashSet<Integer> set,List<List<Integer>> result){

        if(temp.size()==n){
            result.add(new ArrayList<>(temp));
            return ;
        }

        for(int i=0;i<n;i++){
            if(!set.contains(nums[i])){
                temp.add(nums[i]);
                set.add(nums[i]);

                solve(temp,nums,n,set,result);

                set.remove(nums[i]);
                temp.remove(temp.size()-1);
              
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        solve(temp,nums,n,set,result);

        return result;

    }
}