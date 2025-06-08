class LRUCache {
    int n;
    HashMap<Integer,Integer> map;
    Queue<Integer> q=new LinkedList<>();
    public LRUCache(int capacity) {
        n=capacity;
        map=new HashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            int val=map.get(key); //receiving the value that exists in the map;
            q.remove(key);
            q.add(key);
            return val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            int val=map.get(key);
            q.remove(key);
        }
        else if(!q.isEmpty() && map.size()>=n){
            int keyToRemove=q.poll();
            map.remove(keyToRemove);
        }
        map.put(key,value);
        q.add(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */