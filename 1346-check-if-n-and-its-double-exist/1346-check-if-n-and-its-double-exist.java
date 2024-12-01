class Solution {
    public boolean checkIfExist(int[] arr) {

        int n=arr.length;
        int i=0;
        while(i<n){
        for(int j=0;j<n;j++){
            if(i!=j && arr[i]==2*arr[j]){
                return true;
            }
        }
        i++;
        }
        return false;
       /* int n=arr.length;
        for(int i=0;i<n;i++){
            int j=0;
            while(j<n){
                if((arr[i]==2*arr[j]) && (i!=j)){
                    return true;
                }
                else{
                    j++;
                }
            }
        }
        return false;*/
    }
}