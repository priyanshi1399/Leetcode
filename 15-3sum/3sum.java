class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums); //sort it so that same element comes together
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<=n-3;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int j=i+1;
            int k=n-1;

            while(j<k){
                int val=nums[i]+nums[j]+nums[k];
                if(val<0){
                    j++;
                }

                else if(val>0){
                    k--;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                while(j<k && nums[j]==nums[j+1]){
                    j++;
                }
                while(j<k && nums[k]==nums[k-1]){
                    k--;
                }
                j++;
                k--;
                }
            }
        }
        return res;
    }
}