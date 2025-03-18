class Solution {
    public int longestNiceSubarray(int[] nums) {
        int j=0;
        int i=0;
        int n=nums.length;
        int mask=0;
        int maxLength=0;
        while(j<n){
            while((mask & nums[j])!=0){
                mask=mask^nums[i];
                i++;
            }
            maxLength=Math.max(maxLength,j-i+1);
            mask |=nums[j];
            j++;
        }
        return maxLength;
    }
}