class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer,ArrayList<Integer>> adj=new HashMap<>();
        int [] indegree=new int[numCourses]; 
        for(int i=0;i<numCourses;i++){
            adj.putIfAbsent(i,new ArrayList<>());
        }

        for(int [] p:prerequisites){
            adj.get(p[1]).add(p[0]);
            indegree[p[0]]++;
     
        }
        int count=0;
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
                count++;
            }
        }

        while(!q.isEmpty()){
            int u=q.peek();
            q.poll();
            result.add(u);

            for(int v: adj.getOrDefault(u,new ArrayList<>())){
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                    count++;
                }
            }
        }
        if(count!=numCourses){
            return new int[0];
        }
        int [] res=new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
        
        return res;


    }
}