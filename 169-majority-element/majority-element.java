class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int majEle=0;

        for(int i=0;i<n;i++){
            if(nums[i]==majEle){ //if it is the same element
                    count++;
            }
            else if(count==0){
                majEle=nums[i]; //assign to that number
                count=1;
            }
            else {
                count--;
            }
        }
        return majEle;
    }
}