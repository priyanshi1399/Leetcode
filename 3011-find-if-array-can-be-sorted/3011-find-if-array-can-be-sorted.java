class Solution {
     public boolean canSortArray(int[] nums) {
        int n=nums.length;
        boolean flag=true;
        for(int i=0;i<n;i++){

             flag=false;
            for(int j=0;j<n-i-1;j++){

            if(nums[j]<nums[j+1]){
                continue;
            }
            else{
                if(Integer.bitCount(nums[j])==Integer.bitCount(nums[j+1])){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
                flag=true;
                }
            else{
                return false;
            }
            }
            }
        if(flag==false) {//array is sorted
        break;
        }
        
            }

        return true;
    

    /*private int calculateSetBit(int n){
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
        return flag;*/
        
    }
}