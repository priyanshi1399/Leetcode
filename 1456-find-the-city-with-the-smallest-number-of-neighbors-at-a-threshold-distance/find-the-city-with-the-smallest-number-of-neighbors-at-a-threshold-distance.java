class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int [][] dist=new int[n][n];
        for(int [] row: dist){
            Arrays.fill(row,100000);
        }  
        for(int i=0;i<n;i++){
            dist[i][i]=0;
        } 

        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];

            dist[u][v]=w;
            dist[v][u]=w;
        }

        for(int via=0;via<n;via++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    dist[i][j]=Math.min(dist[i][j], dist[i][via]+dist[via][j]);
                }
            }
        }

        int result=-1;
        int leastReachCount=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(i!=j && dist[i][j]<=distanceThreshold){
                    count++;
                }
            }
            if(count<=leastReachCount){
                leastReachCount=count;
                result=i;
            }
        }
        return result;
    }
}