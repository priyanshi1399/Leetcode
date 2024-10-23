class Solution {

    public int [] generateArray(int k,int s,int [] res){
        int [] newArray=new int[res.length+k];
        System.arraycopy(res,0,newArray,0,res.length);

       for(int i=0;i<k;i++){
        newArray[res.length+i]=s;
        }
    return newArray;
    }

    public int[] decompressRLElist(int[] nums) {
      //  int [] ans=new int[0];
        int [] res=new int[0];
        int n=nums.length;
        for(int i=0;i<n;i=i+2){
            res=generateArray(nums[i],nums[i+1],res);
        }
        return res;
    }
}