class EventManager {
    PriorityQueue<int []> pq;
    Map<Integer,Integer> map;

    public EventManager(int[][] events) {
        pq=new PriorityQueue<>((a,b)->{
            int val1=a[1];
            int val2=b[1];
            if(a[1]!=b[1]){
                return Integer.compare(b[1],a[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
      map=new HashMap<>();
        for(int [] event: events){
            pq.add(event);
            map.put(event[0],event[1]);
        }
        
    }
    
    public void updatePriority(int eventId, int newPriority) {
        pq.add(new int [] {eventId,newPriority});
        map.put(eventId,newPriority);
    }
    
    public int pollHighest() {
      while(!pq.isEmpty()){
          int [] curr=pq.poll();
          int id=curr[0];
          int priority=curr[1];
          if(map.containsKey(id) && map.get(curr[0])==curr[1]){
              map.remove(curr[0]);
              return id;
          }
      }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */