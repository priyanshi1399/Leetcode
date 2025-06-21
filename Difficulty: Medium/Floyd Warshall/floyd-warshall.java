// User function template for JAVA

class Solution {
    public void floydWarshall(int[][] dist) {
        int n=dist.length;
        
        for(int via=0;via<n;via++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][via]!=10_00_00_000 && dist[via][j]!=10_00_00_000)
                    dist[i][j]=Math.min(dist[i][j],dist[i][via]+dist[via][j]);
                }
            }
        }
       
        
    }
}