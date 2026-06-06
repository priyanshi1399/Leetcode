class Solution {
    public int majorityElement(int[] nums) {
        Integer majorityElement=null;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(majorityElement!=null && majorityElement==nums[i]){
                count++;
            }
            else if(count==0){
                majorityElement=nums[i];
                count=1;
            }
            else{
                count--;
            }
        }
        return majorityElement;
    }
}