class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int id=0;
        int left=0;
        int top=0;
        int down=m-1;
        int right=n-1;
        List<Integer> res=new ArrayList<>();
        while(left<=right && top<=down){
            if(id==0){ //top constant  row constant not col
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            }

            if(id==1){ //top to down column constant not row
                 for(int i=top;i<=down;i++){
                res.add(matrix[i][right]);
            }
            right--;
            }

            if(id==2){ //row constant not column
                for(int i=right;i>=left;i--){
                res.add(matrix[down][i]);
            }
            down--;
            }

            if(id==3){ //col constant not row
                for(int i=down;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }

            id=(id+1)%4;
        }
        return res;
    }
}