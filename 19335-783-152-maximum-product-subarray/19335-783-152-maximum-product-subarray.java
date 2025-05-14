class Solution {
    public int maxProduct(int[] nums) {
        int maxSum_endinghere=nums[0];
        int minSum_endingHere=nums[0];
        int answer=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=Math.max(Math.max(maxSum_endinghere*nums[i],nums[i]),minSum_endingHere*nums[i]);
            int y=Math.min(Math.min(maxSum_endinghere*nums[i],nums[i]),minSum_endingHere*nums[i]);

            maxSum_endinghere=x;
            minSum_endingHere=y;
            answer=Math.max(maxSum_endinghere,answer);
        }
        return answer;
    }
}