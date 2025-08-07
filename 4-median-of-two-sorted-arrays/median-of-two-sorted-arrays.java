class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int [] mergedArray=new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        int idx1=(mergedArray.length/2-1);
        int idx2=mergedArray.length/2;
        int element1=0,element2=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                if(k==idx1){
                    element1=nums1[i];
                }
                if(k==idx2){
                    element2=nums1[i];
                }
                k++;
                i++;
            }
            else{
                
                if(k==idx1){
                    element1=nums2[j];
                }
                if(k==idx2){
                    element2=nums2[j];
                }
                k++;
                j++;
            }
        }
        while(i<n1){
            if(k==idx1){
                    element1=nums1[i];
                }
                if(k==idx2){
                    element2=nums1[i];
                }
                k++;
                i++;
        }

        while(j<n2){
                if(k==idx1){
                        element1=nums2[j];
                }
                if(k==idx2){
                    element2=nums2[j];
                }
                k++;
                j++;
        }
        double median=0.0;
        int len=mergedArray.length;
        if(len%2==0){
            median=(element1+element2)/2.0;
        }
        else{
            median=element2;
        }
        return (double)median;

    }
}