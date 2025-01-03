class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[l]){
                if(nums[l]<=target && target<=nums[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[r]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}
/* 0(n)

 public int customBinarySearch(int l,int r,int [] nums,int target){
        
        while(l<=r){
        int mid=l+(r-l)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            l=mid+1;
        }
        else{
            r=mid-1;
        }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
       
        int n=nums.length;
        if(n==1 && target==nums[0]){
            return 0;
        }
        int pivot=0;
        for(int i=0;i<n;i++){
            if(i+1<n && nums[i+1]<nums[i]){
                pivot=i;
                break;
            }
        }
        System.out.println(pivot);
        int l1=0;
        int r1=pivot;

        int ans=customBinarySearch(l1,r1,nums,target);
        if(ans==-1){
           return customBinarySearch(r1+1,n-1,nums,target);
        }
        else{
            return ans;
        }
        
    }



*/