class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=1;
        int majEle=nums[0];

        for(int i=1;i<n;i++){
            if(nums[i]==majEle){
                count++;
            }
            else if(count==0){
                majEle=nums[i];
                count=1;
            }
            else{
                count--;
            }
        }
        return majEle;


    }
}