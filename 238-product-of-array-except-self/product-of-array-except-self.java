class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] prefixArray=new int[n];
        int left=1; //take 1 in the start
        prefixArray[0]=1;
        for(int i=1;i<n;i++){ //populate the prefixProductArray
            prefixArray[i]=nums[i-1]*left;
            left=prefixArray[i];
        }

        int [] suffixArray=new int[n];
        int right=1; //take 1 in the start
        suffixArray[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffixArray[i]=right*nums[i+1];
            right=suffixArray[i];
        }

        int [] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=prefixArray[i]*suffixArray[i];
        }
        return result;
    }
}