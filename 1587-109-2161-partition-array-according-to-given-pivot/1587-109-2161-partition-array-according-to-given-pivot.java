class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int countLess=0;
        int countEqual=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                countLess++;
            }
            else if(nums[i]==pivot){
                countEqual++;
            }
        }

        int [] result=new int[nums.length];
        int i=0;
        int j=countLess;
        int k=countLess+countEqual;

      for(int value=0;value<nums.length;value++){
        if(nums[value]<pivot){
            result[i]=nums[value];
            i++;
        }
        else if(nums[value]==pivot){
            result[j]=nums[value];
            j++;
        }
        else{
            result[k]=nums[value];
            k++;
        }

      }
      return result;
        
    }
}