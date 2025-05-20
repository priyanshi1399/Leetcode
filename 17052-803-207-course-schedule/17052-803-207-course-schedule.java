class Solution {
    public boolean  isCycleDFS(int u,List<List<Integer>> adj,boolean [] visited,boolean [] inRecursion){
        visited[u]=true;
        inRecursion[u]=true;
            for(int v:adj.get(u)){
                
                if(!visited[v] && isCycleDFS(v,adj,visited,inRecursion)){
                        return true;
                    }

                else if(inRecursion[v]==true){
                    return true;
                }

            }
            inRecursion[u]=false;
            return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

       for(int [] p: prerequisites){
            adj.get(p[1]).add(p[0]);
       }
    
       
        boolean [] visited=new boolean[numCourses];
        boolean [] inRecursion=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i] && isCycleDFS(i,adj,visited,inRecursion)){
                return false;
            }
        }
        return true;


    }
}