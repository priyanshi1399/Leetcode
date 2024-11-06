class Solution {

    private int calculateSetBit(int n){
        int count=0;
        while(n>0){
            int rem=n%2;
            n=n/2;
            if(rem==1){
                count++;
            }
        }
        return count;
    }

    public boolean canSortArray(int[] nums) {
        boolean flag=true;
        int i=1;
        while(i <nums.length){
            if(nums[i-1]>nums[i]){
                if(calculateSetBit(nums[i])==calculateSetBit(nums[i-1])){
                    int temp=nums[i-1];
                    nums[i-1]=nums[i];
                    nums[i]=temp;
                    i=1;    
                    flag=true;             
                }
                else{
                    flag=false;
                    break;
                }
               
            }
            else{
                i++;
            }
        
        }
        return flag;
        
    }
}