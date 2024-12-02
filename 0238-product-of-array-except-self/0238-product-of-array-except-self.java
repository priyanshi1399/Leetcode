class Solution {

     public int[] productExceptSelf(int[] nums) {
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=1;
        }
        int left=1;
        for(int i=0;i<nums.length;i++){
            ans[i]*=left;
            left*=nums[i];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=right;
            right*=nums[i];
        }
        return ans;
        
    }
}
  /*  public int prefixProduct(int[] nums,int i){
        int prefixProductExceptSelf=1;
        if(i==0){
        prefixProductExceptSelf=1;
        }
        else{
            for(int j=i-1;j>=0;j--){
                prefixProductExceptSelf=prefixProductExceptSelf*nums[j];
            }
        }
        return prefixProductExceptSelf;
    }

    public int suffixProduct(int [] nums,int i){
        int n=nums.length;
        int suffixProductExceptSelf=1;
        if(i==n-1){
            suffixProductExceptSelf=1;
        }
        else{
            for(int j=i+1;j<n;j++){
                suffixProductExceptSelf=suffixProductExceptSelf*nums[j];
            }
        }
        return suffixProductExceptSelf;
    }

    public int[] productExceptSelf(int[] nums) {

        int n=nums.length;
        int [] result=new int[n];
        for(int i=0;i<result.length;i++){
            result[i]=prefixProduct(nums,i)*suffixProduct(nums,i);
        }
        return result;
    }
} */
    /*public int[] productExceptSelf(int[] nums){
       int n=nums.length;
        int [] ans=new int[n];
        int [] prefixProduct=new int[n];
        int [] suffixProduct=new int[n];

        prefixProduct[0]=1;
        for(int i=1;i<n;i++){
            prefixProduct[i]=prefixProduct[i-1]*nums[i-1];
        }

        suffixProduct[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffixProduct[i]=suffixProduct[i+1]*nums[i+1];
        }

        for(int i=0;i<ans.length;i++){
            ans[i]=prefixProduct[i]*suffixProduct[i];
        }
        return ans;

    }
}*/
