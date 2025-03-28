class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int majorEle=nums[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(count==0){
               majorEle=nums[i]; //new element is now my majority element
               count=1; 
            }
            else if(majorEle==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return majorEle;
    }
}