class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        long XOR=0;
        for(int i=0;i<n;i++){
            XOR=XOR ^ nums[i];
        }
       // System.out.println(XOR);

        //converting for rightmost digit 

        
        int rightMost=(int)((XOR) & (XOR-1)) ^(int)(XOR);
      //   System.out.println(rightMost);
        int b1=0;
        int b2=0;

        for(int i=0;i<n;i++){
            if((nums[i] & rightMost)!=0){ //its rightmost is 1 putin bucket 1
                b1=b1^nums[i];
            }

            else{
                b2=b2^nums[i]; //put in 2 for 0 rightMost bit
            }
        }

        if(b1<b2){
            return new int[]{b1,b2};
        }
        else{
            return new int[] {b2,b1};
        }
    
    }
}