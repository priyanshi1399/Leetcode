class Solution {
    public void backtrack(int idx,int k,int n,List<Integer> temp,List<List<Integer>> res){
        if(n==0 && temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }


        for(int i=idx;i<=9;i++){
            if(i>n){
                break;
            }
            temp.add(i);
            backtrack(i+1,k,n-i,temp,res);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(1,k,n,new ArrayList<>(),res);
        return res;
    }
}