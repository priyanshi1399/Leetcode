class Solution {
    public boolean isValid(int [] nums,int count,int i,int dir){
        int [] temp=nums.clone();
        int idx=i;
        while(idx>=0 && idx<nums.length && count>0){
            if(temp[idx]>0){
                temp[idx]--;
                dir*=-1;
                if(temp[idx]==0){
                    count--;
                }
            }
            idx+=dir;
        }
        return count==0;
    }
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int result=0;
        int count=0;

        for(int num:nums){
            if(num!=0){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(isValid(nums,count,i,1)){
                    result++;
                }
                if(isValid(nums,count,i,-1)){
                    result++;
                }
        }
        }
        return result;
    }


}