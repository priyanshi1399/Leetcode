class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int n1=nums[0];
        int n2=nums[n-1];
        while(n1!=0 && n2!=0){
            if(n1>n2){
            n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }       
        }
        if(n2==0){
            return n1;
        }
        else{
            return n2;
        }
}
}
//T(C)-->0(n logn)+0(nlogn)+0(log(min(m,n)));
//S(c)-0(1)