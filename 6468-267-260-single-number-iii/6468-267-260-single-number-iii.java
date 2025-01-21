class Solution {
    public int[] singleNumber(int[] nums) {
        long XOR=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
             XOR=XOR^nums[i];
        }
        System.out.println(XOR);

        int rightMost= (int)(XOR & (XOR-1))^ (int)XOR;
         System.out.println(rightMost);
        int b1=0;
        int b2=0;
        for(int i=0;i<n;i++){
            if((rightMost & nums[i])!=0){
               b1= b1^nums[i];
            }
            else{
                b2=b2^nums[i];
            }
        }
    return new int[]{b1,b2};
    }
}