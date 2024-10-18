class Solution {
    public int missingNumber(int[] nums) {
       /* int n=nums.length;
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
    return result;*/

  


    //Approach-2

      /* int n=nums.length; 
        int result=n; //storing length    //XOR of same number will be zero 
        for(int i=0;i<n;i++){
            result=result^i;
            result=result^nums[i];
        }
        return result;
*/

int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum -= nums[i];
        }
        return sum;


}
}