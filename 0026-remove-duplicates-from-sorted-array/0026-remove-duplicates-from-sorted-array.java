class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=1;
        int j=1;
        int count=1;
        while(j<n){
            if(nums[j]!=nums[j-1]){
                nums[i]=nums[j];
                count++;
                j++;
                i++;
            }
            else{
                j++;
            }
        }
        return count;
        /*int n=nums.length;
        int j=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i];
                count++;
                j++;
            }
        }
        return count;*/
    }
}