class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int zeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }

        for(int i=n-1;i>=0;i--){
            if(zeroes+i<n){
                arr[i+zeroes]=arr[i];
            }
            if(arr[i]==0){
                zeroes--;
                if(i+zeroes<n){
                    arr[i+zeroes]=0;
                }
            }
        }
    }
}


/*
 public void shiftArrayValues(int [] arr,int k){
        int n1=arr.length;
        for(int i=n1-1;i>k;i--){
            arr[i]=arr[i-1];
        }
        if(k!=n1){       
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



*/