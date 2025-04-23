class Solution {
    public boolean checkCycleDFS(int u, boolean [] inRecursion, boolean [] visited,int numCourses,HashMap<Integer,List<Integer>> adj){
        visited[u]=true;
        inRecursion[u]=true;

        for(int v:adj.getOrDefault(u,new ArrayList<>())){
            if(!visited[v] && checkCycleDFS(v,inRecursion,visited,numCourses,adj)){
                return true; 
            }
            if(inRecursion[v]==true){
                return true;
            }
        }
        inRecursion[u]=false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> adj=new HashMap<>();
        int [] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj.putIfAbsent(i,new ArrayList<>());
        }

        for(int [] p:prerequisites){
            adj.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        boolean [] visited=new boolean [numCourses];
        boolean [] inRecursion=new boolean [numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(checkCycleDFS(i,inRecursion,visited,numCourses,adj)){
                    return false;
                }
            }
        }
            return true;
        
    }
}