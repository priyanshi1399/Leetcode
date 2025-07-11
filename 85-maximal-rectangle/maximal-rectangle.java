class Solution {
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
                prefixSum[i][j]=0;
                sum=0;
               }
               else{
                prefixSum[i][j]=sum;
               }
            }          
        }

        for(int i=0;i<m;i++){
            
            maxArea=Math.max(maxArea,findMaxRectangle(prefixSum[i]));
        }
        return maxArea;
    }

        public int findMaxRectangle(int [] area){
            int n=area.length;
        Stack<Integer> stck=new Stack<>();
        int nse,pse;
        int maxArea=0;
        for(int i=0;i<n;i++){
            while(!stck.isEmpty() && area[stck.peek()]>=area[i]){

               int  index=stck.pop();

                nse=i;
                pse=stck.isEmpty()?-1:stck.peek();
                maxArea=Math.max(maxArea,(area[index]*(nse-pse-1)));
                
            }
            stck.push(i);
        }
        
        while(!stck.isEmpty()){
            int index=stck.pop();
            nse=n;
            pse=stck.isEmpty()?-1:stck.peek();
            maxArea=Math.max(maxArea,(area[index]*(nse-pse-1)));
        }

        return maxArea;


    }
}