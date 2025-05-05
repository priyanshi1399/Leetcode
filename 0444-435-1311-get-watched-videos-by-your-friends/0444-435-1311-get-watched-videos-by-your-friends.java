class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        int n=friends.length;
        Queue<Integer> q=new LinkedList<>();
        boolean [] vis=new boolean[n];
        q.add(id);
        vis[id]=true;
        while(level>0){
            int size=q.size();
            while(size--> 0){
                int u=q.poll();
                for(int f:friends[u]){
                    if(!vis[f]){
                        vis[f]=true;
                        q.add(f);
                    }
                }
            }
            level--;
        }
        Map<String,Integer> map=new HashMap<>();
        while(!q.isEmpty()){
            List<String> video=watchedVideos.get(q.poll());
            for( String v: video){
                map.put(v,map.getOrDefault(v,0)+1);
            }
        }

        List<String> ans=new ArrayList<>(map.keySet());
        ans.sort((a,b)-> {
            int freq1=map.get(a);
            int freq2=map.get(b);

            if(freq1!=freq2){
                return freq1-freq2;
            }
            else{
                return a.compareTo(b);
            }
        });

    return ans;

    }
}