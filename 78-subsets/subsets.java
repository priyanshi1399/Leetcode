class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>(); // result list
        int subLimit=(int)Math.pow(2,n); // limit till here subset will be formed
        for(int num=0;num<subLimit;num++){
            List<Integer> temp=new ArrayList<>(); //taking temporary list
            for(int bitIndex=0;bitIndex<n;bitIndex++){
                if((num & (1<<bitIndex))!=0){ //checking bit is set 
                    temp.add(nums[bitIndex]); //include that index element
                }
            }
            res.add(temp);
        }
        return res;
    }
}