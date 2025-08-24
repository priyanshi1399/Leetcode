class Solution {
    public int findMaximalRectangle(int [] area){
        int n=area.length;
        int maxArea=0;
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<n;i++){

            while(!stck.isEmpty() && area[stck.peek()]>=area[i]){

                int index=stck.pop();

                int nse=i;
                int pse=stck.isEmpty()?-1:stck.peek();
                maxArea=Math.max(maxArea,area[index]*(nse-pse-1));
            }
            stck.push(i);
        }

             while(!stck.isEmpty()){

                int index=stck.pop();

                int nse=n;
                int pse=stck.isEmpty()?-1:stck.peek();
                maxArea=Math.max(maxArea,area[index]*(nse-pse-1));
            }
            return maxArea;
        }
    
    public int maximalRectangle(char[][] matrix) {
          int m=matrix.length;
        int n=matrix[0].length;
        int maxArea=0;
        int [][] prefixSum=new int[m][n];
        
        for(int j=0;j<n;j++){
            int sum=0;
            for(int i=0;i<m;i++){
                sum+=matrix[i][j]-'0';
                if(matrix[i][j]=='0'){
                    sum=0;
                    prefixSum[i][j]=sum;
                }
                else{
                    prefixSum[i][j]=sum;
                }
            }
        
        }

        for(int i=0;i<m;i++){
            maxArea=Math.max(maxArea,findMaximalRectangle(prefixSum[i]));
        }
        return maxArea;  

    }
}