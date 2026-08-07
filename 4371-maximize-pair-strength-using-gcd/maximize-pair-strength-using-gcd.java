class Solution {
    public long findGcd(long n1,long n2){
        while(n1!=0 && n2!=0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        if(n1==0){
            return n2;
        }
        return n1;
    }
    
    public long maxPairStrength(int[] nums) {
        long maxStrength=Long.MIN_VALUE;
        int n=nums.length;
        //Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

        //long gcd=(long)(nums[i]*nums[j])/((long)Math.pow(findGcd(nums[i],nums[j]),2));
            long multiply=(long)nums[i]*nums[j];
            long gcd=(long)findGcd(nums[i],nums[j]);
            long product=(long)gcd*gcd;
            long strength=(long)multiply/product;
            maxStrength=Math.max(maxStrength,strength);
    }
        }
        return maxStrength;
    }
}