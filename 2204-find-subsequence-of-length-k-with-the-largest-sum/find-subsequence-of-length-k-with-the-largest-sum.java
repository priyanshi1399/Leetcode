class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        int [] newArray=Arrays.copyOf(nums,n);

        Arrays.sort(newArray);
        int threshold=newArray[n-k];
        int countThreshold=0;
        for(int i=n-k;i<n;i++){
            if(newArray[i]==threshold){
                countThreshold++;
            }
        }
        int idx=0;
        int [] ans=new int[k];
        for(int num:nums){
            if(num>threshold){
                ans[idx++]=num;
            }
            else if(num==threshold && countThreshold>0){
                ans[idx++]=num;
                countThreshold--;
            }
            if(idx==k){
                break;
            }
        }
        return ans;

        
    }
}