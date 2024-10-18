class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int result=nums.length;
        int l=0;
        int r=n-1; //at last

        while(l<=r){
        //calculating mid
        int mid=l+(r-l)/2;

        if(nums[mid]>mid) //element should be on left or may be my mid is element
        {
            result=mid;
            r=mid-1;
        }
        else{
            l=mid+1;
        }
        
    }
    return result;
}
}