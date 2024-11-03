class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;


       /* int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
        if(arr[left]<arr[left+1]){
            left++;
        }
        else if(arr[right]<arr[right-1]){
            right--;
        }
        }

        return left;*/
        /*int n=arr.length;
        int i=0;
        for(;i<n;i++){
            if(arr[i]>arr[i+1]){
                break;
            }
        }
        return i;*/
    }
}