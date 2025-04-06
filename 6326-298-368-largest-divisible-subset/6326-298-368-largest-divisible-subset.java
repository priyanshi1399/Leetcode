class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int [] dp=new int[n];
        Arrays.fill(dp,1); //already having 1 LIS
        int [] prev=new int[n];
        Arrays.fill(prev,-1);
        int last_chosen_index=0;
        int maxL=1; //we have 1 for everyIndex
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(dp[i]<dp[j]+1){
                        dp[i]=dp[j]+1;
                        prev[i]=j; //updating prev_index where I found last
                    }
                    if(dp[i]>maxL){
                        maxL=dp[i];
                        last_chosen_index=i;
                    }
                }               
            }
        }

        List<Integer> result=new ArrayList<>();
        while(last_chosen_index!=-1){
            result.add(nums[last_chosen_index]); //-->4-->nums[4]->64->prev[4]=3 ->add(nums[3])-->32-->now at 1-->nums[1]-->add (8)-->prev[1]=-1 stops
            last_chosen_index=prev[last_chosen_index];
        }
        return result;
    }
}