class Solution {
    public void swap(int x,int y,int [] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }

    public void solve(int idx,int [] nums,int n,List<List<Integer>> result){
        List<Integer> temp =new ArrayList<>();
        if(idx==n){
           for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
           }
            
            result.add(temp);
            return;
        }

        for(int i=idx;i<n;i++){

            swap(i,idx,nums);

            solve(idx+1,nums,n,result);

            swap(i ,idx,nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        solve(0,nums,n,result);
        return result;

    }
}
   /* public void solve(List<Integer> temp,int [] nums,int n,HashSet<Integer> set,List<List<Integer>> result){

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
}*/