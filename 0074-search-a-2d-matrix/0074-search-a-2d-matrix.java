class Solution {
     public boolean searchMatrix(int [][]matrix, int target){
        int m=matrix.length;
        int n=matrix[0].length;

        int l=0;
        int h=m*n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]<target){
                l=mid+1;
            }
            else if(matrix[row][col]==target){
                return true;
            }
            else{
                h=mid-1;
            }          
        }
        return false;



       /* int l=0;
        int h=row.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(row[mid]<target){
                l=mid+1;
            }
            else if(row[mid]==target){
                return true;
            }

            else{
                h=mid-1;
            }
        }
          return false;
    }

    public boolean searchMatrix(int [][]matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

    for(int i=0;i<m;i++){
    if(matrix[i][0]<=target && target<=matrix[i][n-1]){
        if(binaryMatrix(matrix[i],target)){
            return true;
        }  
    }
    }
    return false;*/

    }
}