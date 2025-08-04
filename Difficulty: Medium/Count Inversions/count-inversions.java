class Solution {
    public static int merge(int low,int mid,int high,int [] arr){
      
        int n1=mid-low+1; //size of array 1
        int n2=high-mid;       //size of array 2
        int [] L=new int [n1];
       
        for(int i=0;i<n1;i++){
            L[i]=arr[low+i];
        }
        
         int [] R=new int [n2];
          for(int i=0;i<n2;i++){
            R[i]=arr[mid+1+i];
        }
        
        int i=0,j=0,k=low,  count=0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k++]=L[i++];
            }
            else{
                 arr[k++]=R[j++];
                 count+=n1-i;
            }
        }
        while(i<n1){
            arr[k++]=L[i++];
        }
        while(j<n2){
            arr[k++]=R[j++];
        }
        return count;
    }
    public static int mergeSort(int low, int high,int [] arr ){
        int count=0;
        if(low<high){
            
        
        int mid=low+(high-low)/2;
        count+=mergeSort(low,mid,arr);
        count+=mergeSort(mid+1,high,arr);
        
       count+= merge(low,mid,high,arr);
        }
        return count;
        
        
    }
    static int inversionCount(int arr[]) {
        int n=arr.length;
       
        
        return mergeSort(0,n-1,arr);
        
        
        
    }
}