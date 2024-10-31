class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        Integer [] arr=new Integer[matrix.length *matrix[0].length];
        int index=0;
        while(index!=arr.length){
            for(int i=left;i<=right && index!=arr.length;i++){
                arr[index]=matrix[top][i];
                index++;
            }
            top++;
             for(int i=top;i<=bottom && index!=arr.length;i++){
                arr[index]=matrix[i][right];
                index++;
            }
            right--;
             for(int i=right;i>=left && index!=arr.length;i--){
                arr[index]=matrix[bottom][i];
                index++;
            
            }
            bottom--;
              for(int i=bottom;i>=top && index!=arr.length;i--){
                arr[index]=matrix[i][left];
                index++;
            }
            left++;
            
            
            
        }
        return Arrays.asList(arr);

      /* int rows=matrix.length;
       int cols=matrix[0].length;

       int col=-1;
       int row=0;
        int direction=1;
        List<Integer> arr=new ArrayList<>();
        while(rows>0 && cols>0){
            for(int i=0;i<cols;i++){
                col+=direction;
                arr.add(matrix[row][col]);
            }
            rows--;
            for(int i=0;i<rows;i++){
                row=row+direction;
                arr.add(matrix[row][col]);
            }
            cols--;
            direction*=-1;
        }
        return arr;*/

    }
}