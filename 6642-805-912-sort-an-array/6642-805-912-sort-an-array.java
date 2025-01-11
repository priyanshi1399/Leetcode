class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    private void mergeSort(int [] nums,int l,int h){
        if(l<h){
            int mid=l+(h-l)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,h);
            merge(nums,l,mid,h);
        }
    }

        private void merge(int [] nums,int l,int mid,int h){

            int n1=mid-l+1;
            int [] a=new int[n1];
            for(int i=0;i<n1;i++){
                a[i]=nums[l+i];
            }

            int n2=h-mid;
            int [] b=new int[n2];
             for(int i=0;i<n2;i++){
                b[i]=nums[mid+1+i];
            }
            int i=0, j=0,k=l;
            while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                nums[k++]=a[i++];
            }
            else{
                nums[k++]=b[j++];
            }
            }

            while(i<n1){
                nums[k++]=a[i++];
            }

            while(j<n2){
                nums[k++]=b[j++];
            }

    }
}