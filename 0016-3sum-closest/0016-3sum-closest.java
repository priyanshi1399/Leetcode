class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closestSum=Integer.MAX_VALUE;
        for(int i=0;i<=n-3;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(closestSum-target)){
                    closestSum=sum;
                }             
                
                if(sum<target){               
                    j++;
                }

                else{
                    k--;
                }
        }
        }

        return closestSum;
    }
}