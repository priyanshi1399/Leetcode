class Solution {
    public int maxProduct(int[] nums) {
        int answer=nums[0];
        int max_ending_here=nums[0];
        int min_ending_here=nums[0];
        for(int i=1;i<nums.length;i++){
           int x=Math.max(Math.max(max_ending_here*nums[i],nums[i]),min_ending_here*nums[i]);
           int y=Math.min(Math.min(max_ending_here*nums[i],nums[i]),min_ending_here*nums[i]);
           max_ending_here=x;
           min_ending_here=y;
           
           answer=Math.max(answer,max_ending_here);
  
        }
        return answer;


    }
}

/*
-1,-2,-3,-4
minProductEndingHere ,it can actually gives you maximum value
maxProductEndingHere=-1
maxProductEndingHere=2
maxProductEndingHere=-3
maxProductEndingHere=12 
but here we left -1*-2*-3*-4 will have max product we missed this.
*/

