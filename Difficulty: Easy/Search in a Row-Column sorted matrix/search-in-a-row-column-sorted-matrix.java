class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            if(binarySearch(mat[i],x)){
                return true;
            }
        }
        return false;
        
    }
    public static boolean binarySearch(int []matRow, int x){
        int low=0;
        int high=matRow.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matRow[mid]==x){
                return true;
            }
            else if(matRow[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}