class Solution {
    public boolean isTrionic(int[] nums) {
        boolean isIncresing=false;
        boolean IsDecreasing=false;
        int n=nums.length;
        int i=0;
        if(n<=3){
            return false;
        }
        while(i<n-1){
            if(nums[i]<nums[i+1]){
                isIncresing=true;
            }
            else{
                if(i==0){
                    return false;
                }
                isIncresing=false;
                break;
                   
            } 
            i++;  
        }
         while(i<n-1){
            if(nums[i]>nums[i+1]){
                IsDecreasing=true;
            }
            else{
                IsDecreasing=false;
                break;
                   
            } 
            i++;  
        }
        if(i==n-1){
                return false;
        }
        
         while(i<n-1){
            if(nums[i]<nums[i+1]){
                isIncresing=true;
            }
            else{
                isIncresing=false;
                return false;
            } 
            i++;  
        }
        if(i==n-1){
                return true;
        }
        return false;

    }
}