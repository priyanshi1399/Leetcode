class Solution {
    int n;
    public void backtrack(int [] candidates,int target,int idx,List<Integer> temp,List<List<Integer>> res){
       if(idx>=n){
        if(target==0){
            res.add(new ArrayList<>(temp));
        }
        return;
       }
       
        if(candidates[idx]<=target){
            temp.add(candidates[idx]);
            backtrack(candidates,target-candidates[idx],idx,temp,res);
            temp.remove(temp.size()-1);
        }
            backtrack(candidates,target,idx+1,temp,res);
    }
        
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        n=candidates.length;
        List<List<Integer>> res=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),res);
        return res;

    }
}