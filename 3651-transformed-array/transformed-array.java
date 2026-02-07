class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int [] result=new int[n];
        for(int i=0;i<n;i++){
        int shifts=nums[i]%n;

        int newIndex=(i+shifts)%n;

        if(newIndex<0){
            newIndex+=n;
        }

        result[i]=nums[newIndex];
        }

        return result;


    }
}