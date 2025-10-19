class Solution {
    public int maxDistinctElements(int[] nums, int k) {
      Arrays.sort(nums);
      int n=nums.length;
      int prev=Integer.MIN_VALUE;
      int count=0;
      for(int i=0;i<n;i++){
        int minVal=nums[i]-k;
        if(prev<minVal){
            prev=nums[i]-k;
            count++;
        }
        else if(prev<nums[i]+k){
            prev=prev+1;
            count++;
        }
      }
      return count;
       
    }
}