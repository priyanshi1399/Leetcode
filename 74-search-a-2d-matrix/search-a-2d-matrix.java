class Solution {
    public boolean binarySearch(int [] row,int target){
        int l=0;
        int h=row.length-1;

        while(l<=h){
            int mid=l+(h-l)/2;
            if(row[mid]==target){
                return true; //that exists in my row
            }
            else if(row[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length; // size of row 
        int n=matrix[0].length;  //size of column

        for(int i=0;i<m;i++){
            if(target>=matrix[i][0] && target<=matrix[i][n-1]){
                return binarySearch(matrix[i],target);
            }
        }

        return false;
    }
}