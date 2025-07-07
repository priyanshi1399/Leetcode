class LRUCache {
    HashMap<Integer,Integer> map;
    Queue<Integer> queue;
    int n;
    public LRUCache(int capacity) {
        map=new HashMap<>();
        queue=new LinkedList<>();
        n=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            int val=map.get(key);
            queue.remove(key);
            queue.add(key);
            return val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            queue.remove(key);
        }
        else if((map.size()>=n) && (!queue.isEmpty())){
            int keyToRemove=queue.poll();
            map.remove(keyToRemove);
        }
        map.put(key,value);
        queue.add(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */