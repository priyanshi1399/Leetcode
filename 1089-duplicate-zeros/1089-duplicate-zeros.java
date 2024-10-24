class Solution {

    public void duplicatingAndShifting(int [] arr,int val,int index){
        int n=arr.length;
        if(index!=n){
        for(int i= n-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=val;
    }
    }

    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
            duplicatingAndShifting(arr,arr[i],i+1);
            //System.out.println("The value of i "+i);
            i++;
        }
        }
    }
}