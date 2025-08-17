class Solution {
    int n;
    public void backtrack(int [] candidates,int target,int idx,List<Integer> temp,List<List<Integer>> res){
        if(target<0){
            return;
        }

        if(target==0){
            res.add(new ArrayList<>(temp));
        }

        for(int i=idx;i<n;i++){
            temp.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i,temp,res);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        n=candidates.length;
        List<List<Integer>> res=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),res);
        return res;

    }
}