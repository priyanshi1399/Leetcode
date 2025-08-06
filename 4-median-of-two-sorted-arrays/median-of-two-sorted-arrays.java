class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int [] mergedArray=new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                mergedArray[k++]=nums1[i++];
            }
            else{
                mergedArray[k++]=nums2[j++];
            }
        }
        while(i<n1){
            mergedArray[k++]=nums1[i++];
        }

        while(j<n2){
            mergedArray[k++]=nums2[j++];
        }
        double median=0.0;
        int len=mergedArray.length;
        if(len%2==0){
            median=((double)mergedArray[(len/2)-1]+mergedArray[len/2])/2;
        }
        else{
            median=(double)mergedArray[len/2];
        }
        return median;

    }
}