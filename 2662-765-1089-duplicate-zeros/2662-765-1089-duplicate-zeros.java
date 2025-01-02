class Solution {

    public void shiftArrayValues(int [] arr,int k){
        int n1=arr.length;
        for(int i=n1-1;i>k;i--){
            arr[i]=arr[i-1];
        }
        if(k!=n1){     //it should not be inserting at last    
        arr[k]=0;
        }      
    }
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
            shiftArrayValues(arr,i+1);
            i++;
            }
        }
    }
}