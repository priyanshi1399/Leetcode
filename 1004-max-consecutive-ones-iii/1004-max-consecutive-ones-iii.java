class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes=0;
        int left=0;
        int n=nums.length;
        int answer=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zeroes++;
            }
                if(zeroes<=k){
                    answer=Math.max(answer,right-left+1);
                    System.out.println(answer);
                }
                while(zeroes>k){
                    if(nums[left]==0){
                        zeroes--;
                    }
                    left++;
                }
            }
        return answer;
    }
}