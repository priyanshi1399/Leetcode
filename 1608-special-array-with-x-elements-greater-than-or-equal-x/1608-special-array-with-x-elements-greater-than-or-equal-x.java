class Solution {

    public int findNumsOrGreater(int [] nums,int x){
        int l=0;
        int r=nums.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<x){
                l=mid+1;
            }
           if(nums[mid]>=x){
                r=mid;
            }
        }
        return l;
    }

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0;
        int r=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            int count=n-findNumsOrGreater(nums,mid);

            if(count==mid){
                return mid;
            }
            else if(mid<count){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;

       /* int n=nums.length;
        for(int i=0;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[j]>=i){
                    count++;
                }
            }
            if(count==i){
                return i;
            }
        }
        return -1;*/
    }
}