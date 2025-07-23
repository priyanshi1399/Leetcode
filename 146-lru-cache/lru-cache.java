class ListNode{
    public int key,value;
    public ListNode prev,next;

       public ListNode(){
        value=key=-1;
        next=prev=null;
    }
    public ListNode(int key,int value){
        this.key=key;
        this.value=value;
        prev=next=null;
    }
}
class LRUCache {
    int cap;
    ListNode head;
    ListNode tail;
    HashMap<Integer,ListNode> map;
    


    public void deleteNode(ListNode node){
        ListNode nextNode=node.next;
        ListNode prevNode=node.prev;

        nextNode.prev=prevNode;
        prevNode.next=nextNode;
    }

        public void insertAfterHead(ListNode node){
        ListNode nextNode=head.next;
        head.next=node;
        node.prev=head;
        nextNode.prev=node;
        node.next=nextNode;
    }
    public LRUCache(int capacity) {
        cap=capacity;
        head=new ListNode();
        tail=new ListNode();
        map=new HashMap<>();

        head.next=tail;
        tail.prev=head; //making the connection

    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        ListNode node=map.get(key);
        int val=node.value;
        deleteNode(node);
        insertAfterHead(node);
        return val;

    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            ListNode node=map.get(key);
            node.value=value;
            deleteNode(node);
            map.put(key,node);
            insertAfterHead(node);   
            return;
        }
        else if(map.size()>=cap){
           ListNode node= tail.prev;
           int keyToRemove=node.key;
           map.remove(keyToRemove);
           deleteNode(node);
           ListNode newNode=new ListNode(key,value);
           map.put(key,newNode);
           insertAfterHead(newNode);
           return;
        }
        else{
           ListNode newNode=new ListNode(key,value);
           map.put(key,newNode);
           insertAfterHead(newNode);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */