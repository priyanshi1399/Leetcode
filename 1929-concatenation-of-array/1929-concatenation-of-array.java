class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] res=new int[2*n];
        //nums=[2,7,9]
        //res=[2,7,9,2,7,9]
        //res[0]=res[3]=nums[0];
        //res[1]=res[4]=nums[1]
        //res[2]=res[5]=nums[2]
        //res[i]=res[i+n]=nums[i]
        for(int i=0;i<n;i++){
            res[i]=nums[i];
            res[n+i]=nums[i];
        }
        return res;

        /*int n=nums.length;
        int [] res=new int[2*n];
        for(int i=0;i<n;i++){
            res[i]=nums[i];
            res[n+i]=nums[i];
        }
        return res;*/
    }
}               