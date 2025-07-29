class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n=nums.length;
        int [] setBits=new int[32];
        int [] result=new int[n];
        Arrays.fill(setBits,-1);
        for(int i=n-1;i>=0;i--){
            int endIndex=i;
            for(int j=0;j<32;j++){
                //to check jth bit is set or not
                if((nums[i] & (1<<j))==0){
                    if(setBits[j]!=-1){ // if this is set the we can check
                        endIndex=Math.max(setBits[j],endIndex); //checking the maximum what can be given
                    }
                }
                    else{ //if this is already a set bit then just put it bcz it will be least index
                            setBits[j]=i;
                    }

                }
            
            result[i]=endIndex-i+1;

        }
        return result;
    }
}