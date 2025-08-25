class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int prevCount=0;
        int oddCount=0;
        int n=nums.length;
        int result=0;
        int i=0;
        for(int j=0;j<n;j++){
            
            if(nums[j]%2!=0){
                oddCount++;
                prevCount=0; //reset for odd number
            }

            while(oddCount==k){
                prevCount++;

                if(i<n && nums[i]%2==1){ //if that was odd
                    oddCount--;
                }
                i++;
            }

            result+=prevCount;
        }
        return result;
    }
}