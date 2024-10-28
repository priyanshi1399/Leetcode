class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=(int)(Math.pow(nums[i],2));
        }
        int i=0;
        while(i<n){
             int j=i+1;
            while(j<n){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j++;
                }
                else{
                    j++;
                }
            }
            i++;
        }
        return nums;

       /* int n=nums.length;
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;*/
    }
}