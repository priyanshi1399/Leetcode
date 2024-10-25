class Solution {

    public int findMax(int k,int [] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=k;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int [] greater=new int [n];
        greater[n-1]=-1;
        for(int i=0;i<n-1;i++){
            greater[i]=findMax(i+1,arr);
        }
        return greater;
    }
}