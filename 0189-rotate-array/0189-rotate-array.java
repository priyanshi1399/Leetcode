class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n; //reduce swap numbers for large value
        if(k==0){
            return ;
        }
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
    }

    //a b c d
    //l=0 h=3

    private void reverse(int l,int h,int [] nums){
        while(l<h){
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++;
            h--;
        }
    }
}

//T(C)-->0(n)
      /*  int n=nums.length; failing foe longer solutions
        k=k%n;
        if(k==0){
            return;
        }
        //[1,2,3,4,5,6,7]
        //[1,2,3,4,5,6,6]
        //[1,1,2,3,4,5,6]
        int last=nums[n-1];
        for(int i=n-1;i>=1;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=last;
        rotate(nums,k-1);*/

    //}
//}

//[1,2,3,4,5,6,7]
//[7,6,5,4,3,2,1]
//[5,6,7,4,3,2,1]
//[5,6,7,1,2,3,4]