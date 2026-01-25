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
         //maintain the order first of all positive number

        if(arr.length==0){
            return nums;
        }
        //for 3rd rotation and in length 2 , 3rd rotation will be same as 1. 
        k=k%arr.length;
      
    
        for(int i=0,j=0;i<n;i++){
            if(nums[i]>=0){
                nums[i]=arr[(j +k)%arr.length]; //key of the question very important by preserving order it helped
                j++;
            }
        }
        return nums;
        
    }
}