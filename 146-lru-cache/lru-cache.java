class LRUCache {
    int cap;
    Queue<Integer> q;
    HashMap<Integer,Integer> map;
    public LRUCache(int capacity) {
        cap=capacity;
        q=new LinkedList<>();
        map=new HashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            int value=map.get(key);
            q.remove(key);
            q.add(key);
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            q.remove(key);
            map.put(key,value);
            q.add(key);
            return;
        }
        else if(map.size()>=cap){
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