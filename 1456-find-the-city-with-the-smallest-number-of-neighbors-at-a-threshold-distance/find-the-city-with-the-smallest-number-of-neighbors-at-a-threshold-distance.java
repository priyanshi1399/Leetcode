class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int [][] distance=new int[n][n];
        for(int [] row:distance){
            Arrays.fill(row,100000);
        }
        
        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];

            distance[u][v]=wt;
            distance[v][u]=wt;

        }
        

        for(int i=0;i<n;i++){
            distance[i][i]=0;
        }

        for(int via=0;via<n;via++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    distance[i][j]=Math.min(distance[i][j], distance[i][via]+distance[via][j]);
                }
            }
        }
       
    
        int maxCities=n;
        int resultVertex=0;
        for(int i=0;i<n;i++){
            int city=0;
            for(int j=0;j<n;j++){
                if(distance[i][j]<=distanceThreshold){
                    city++;
                }
            }
            
            if(city<=maxCities){
                maxCities=city;
                resultVertex=i;
            }
            
        }
        return resultVertex;

    
    }
}