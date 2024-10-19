class Solution {
    public int[] runningSum(int[] nums) {
       /* int n=nums.length;
        int [] result=new int[n];
        result[0]=nums[0];
        for(int i=1;i<n;i++){
            result[i]=nums[i]+result[i-1];
        }
        return result;*/
        /*
        //1 2 3 4
        i=0
        j=0
        result[0]=0+1=1;
        i=1
        result[1]=1
        j=1
        result[1]=1+2;
        i=2
        j=0;result[2]=1;
        j=1
        result[2]=3
        j=2
        result[2]=6

        */

        /*
        1 2 3 4
        1 3 6 10

        */
       /* int n=nums.length;
        int [] result=new int[n];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
               result[i]=result[i]+nums[j];
            }
        }
        return result;*/

        /* int n=nums.length;
        int [] result=new int[n];
        result[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            result[i]=result[i-1]+nums[i];
        }
        return result;*/


        /*int n=nums.length;
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;*/
        /*
        1 3 6 10

        nums[i-1]=storing the prefix sum till i-1th index (sum from 0 till i-1th index)

        */

        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;

    }
}