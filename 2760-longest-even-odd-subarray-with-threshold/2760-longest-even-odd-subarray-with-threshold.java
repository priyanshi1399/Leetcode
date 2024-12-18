class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n=nums.length;
        int maxLength=0;
    
        for(int l=0;l<n;l++){
            if(nums[l]%2==0 && nums[l]<=threshold){
              int  r=l+1;

            while(r<n && (nums[r]<=threshold) && (nums[r-1]%2!=nums[r]%2)){     
                r++;
            }
            maxLength=Math.max(maxLength,r-l);
            }
        } 
        
        return maxLength;
       /* int n=nums.length;
        int maxLength=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0 && nums[i]<=threshold){
                int j=i+1;
                while((j<n) && (nums[j]<=threshold) && (nums[j-1]%2!=nums[j]%2)){
                    j++;
                }
                maxLength=Math.max(maxLength,j-i);
                
            }
        }
        return maxLength;*/
    }
}