class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
               count++;
            }
        }
        int [] arr=new int[count];
        int index=0;
         for(int i=0;i<n;i++){
            if(nums[i]>=0){
                arr[index++]=nums[i];
            }
         }

        if(arr.length==0){
            return nums;
        }
        k=k%arr.length;
      
    
        for(int i=0,j=0;i<n;i++){
            if(nums[i]>=0){
                nums[i]=arr[(j++ +k)%arr.length];
            }
        }
        return nums;
        
    }
}