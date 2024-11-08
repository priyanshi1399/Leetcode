class Solution {
    public int missingNumber(int[] nums) {
        //first find sum of all numbers from 0 to n
      /*  int n=nums.length;
        int sum=(n*(n+1))/2;
        int arraySum=0;
        for(int i=0;i<n;i++){
            arraySum=arraySum+nums[i];
        }
        //arraySum-sum of all numbers from 0 to n except missing
        return sum-arraySum;*/

       /* int ans=nums.length;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i]^i;
        }
        return ans;*/
        // for(int i=0;i<nums.length;i++){
        //     ans=ans^nums[i];
        // }
        // for(int i=1;i<n;i++){
        //     ans=ans^i;
        // }
       /*int ans=0;
       for(int i=0;i<nums.length;i++){
        ans=ans^nums[i]^(i+1);
       }
       return ans;
*/

//by using Binary Search
    int n =nums.length;
    Arrays.sort(nums);
    int l=0;
    int h=n;
    while(l<h){
        int mid=l+(h-l)/2;
        if(nums[mid]<=mid){
            l=mid+1;
        }
        else{
            h=mid;
        }
    }
    return l;

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

/*int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum -= nums[i];
        }
        return sum;*/


}
}
/**
[3,0,1,4,5]-->original array
[0,1,2,3,4,5]-->[0-n]elements
3^0^1^4^5^0^1^2^3^4^5=2
remove 0 as it is 0

[3,0,1,4,5]
[1,2,3,4,5]

3^1^4^5^1^2^3^4^5=2

 */