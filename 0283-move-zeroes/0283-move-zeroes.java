class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
            j=i; //getting index of first zero o(n)
            break;
            }
        }
        if(j==-1) //there are no zeroes
            return;
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0) {//checking if it is non zero putting i after j then move both i and j
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++; //one condition is that also when at j there 
            //is 0 then also i will be moving everytime so not written else
            }
        }
        
        //TC--0(x)+o(n-x)-0(n)

       /* int n=nums.length;
        int [] res=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                res[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<res.length;i++){
            nums[i]=res[i];
        }*/
    }
}