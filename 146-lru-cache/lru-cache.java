class LRUCache {
    HashMap<Integer,Integer> map;
    Queue<Integer> q;
    int cap;

    public LRUCache(int capacity) {
        cap=capacity;
        map=new HashMap<>();
        q=new LinkedList<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            int val=map.get(key);
            q.remove(key); //first remove
            q.add(key); //push because just now/recently used 
            return val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            q.remove(key); //removing this key from queue

            map.put(key,value); //putting new value
            q.add(key); //became recently used add again
            return;

        }
        else if(map.size()>=cap && !q.isEmpty()){
            int keyToRemove=q.poll(); //get the key from queue and remove from map
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