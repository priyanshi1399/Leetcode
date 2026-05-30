class Solution {
    int minVal=100001;
    public int digitSum(int n){
        return (n/10000)
        +(n%10000/1000)
        +(n%1000/100)
        +(n%100/10)+n%10;
    }
    public int minElement(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
        int n=nums[i];
        int singleNum=digitSum(n);
        minVal=Math.min(minVal,singleNum);
        }
        return minVal;
    }
    
}