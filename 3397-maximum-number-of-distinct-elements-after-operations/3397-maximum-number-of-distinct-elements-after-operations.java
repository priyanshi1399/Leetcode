class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        int distinctCount=0;
        Arrays.sort(nums);
        int n=nums.length;
        int prevMaximum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int lowerValue=nums[i]-k;
            int upperValue=nums[i]+k;

            if(prevMaximum<lowerValue){
                prevMaximum=lowerValue;
                distinctCount++;
            }
            else if(prevMaximum<upperValue){
                prevMaximum++;
                distinctCount++;
            }
        }
        return distinctCount;
    }
}