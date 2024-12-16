class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
            for(int j=1;j<n;j++){
                if(nums[(i+j)%n]>nums[i]){
                    res[i]=nums[(i+j)%n];
                    break;
                }
            }
        }
        return res;
    /*
     1 2 1
    i=0 j=1
    res[0]=2
    i=1 j=1 
    res[1]=-1
    i=2 j=1
    i=2 j=2
    res[2]=2;
    */

       /* int [] temp=new int [2*n]; // 1 2 1 1 2 1
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
            temp[n+i]=nums[i];
        }
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<temp.length;j++){
                if(temp[j]>temp[i]){
                    res[i]=temp[j];
                    break;
                }
                res[i]=-1;        
            }
        }
        return res;*/
    }
}