class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] temp=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                temp[i]=nums[left]*nums[left];
                left++;
            }
            else{
                temp[i]=nums[right]*nums[right];
                right--;
            }

        }
        return temp;






      /*  int n=nums.length;
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
        return nums;*/

       /* int n=nums.length;
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;*/
    }
}