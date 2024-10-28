class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int left=0;
        int right=arr.length-1;

        while(left+1<arr.length-1 && arr[left]<arr[left+1]){
            left++;
        }
        while(right-1>0 && arr[right]<arr[right-1]){
            right--;
        }
       return (left==right);

        /*int n=arr.length;
        if(n<3){
            return false;
        }
        int i=0;
        //loop from start to end, a stop where we reach at the peak of the mountain
        for(;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                return false;
            }
            if(arr[i]>arr[i+1]) //means 8 is greater than 4 in example
            {
                break;
            }
        }
        //check if current index is not strating or end element
        if(i==0 || i==n-1){
            return false;
        }
        //now we have only to check if two elements are not equal or next element is not greater
        for(;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                return false;
            }
            if(arr[i]<arr[i+1])
            {
                return false;
            }
        }
    return true;*/

    }
}
//[1,2,3,5,8,4,3,2,1] --8 break;;;-->check after 
