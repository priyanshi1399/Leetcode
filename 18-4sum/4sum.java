class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<=n-4;i++){
            for(int j=i+1;j<=n-3;j++){
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=nums[i]+nums[j];
                    sum=sum+nums[k]+nums[l];
                    if(sum==target){
                        
                        result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        while(k<l && nums[k]==nums[k+1]){
                            k++;
                        }
                        while(k<l && nums[l]==nums[l-1]){
                            l--;
                        }
                        k++;
                        l--;
                    }
                    else if(nums[i]+nums[j]+nums[k]+nums[l]>target){
                        l--;
                    }
                    else{
                        k++;
                    }
                }
                while(j+1<n && nums[j]==nums[j+1]){
                        j++;
                }
            }

                while(i+1<n-1 && nums[i]==nums[i+1]){
                        i++;
                }

            }
        return result;
    }
}