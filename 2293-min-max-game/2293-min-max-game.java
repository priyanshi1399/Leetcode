class Solution {

    public int [] minMaxModification(int [] nums){
        int n=nums.length;
        int [] nums2=new int[n/2];
        int k=0;
      //  int i=0;
      //  int j=1; can be done with 2 pointer do this i=i+2,j=j+2 instead of k
        while(k<nums2.length){
            nums2[k]=Math.min(nums[2*k],nums[(2*k)+1]); 
            k++;
            nums2[k]=Math.max(nums[2*k],nums[(2*k)+1]);
            k++;
        }
        return nums2;
    }

    public int minMaxGame(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        else if(n==2){
            return (Math.min(nums[0],nums[1]));
        }
        while(nums.length!=2){
            nums=minMaxModification(nums);
        }
        
        return Math.min(nums[0],nums[1]);
    }
}