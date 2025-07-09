class Node{
    public int key,val;
    public Node next;
    public Node prev;

    public Node(){
        key=val=-1;
        next=prev=null;
    }
    public Node(int key,int val){
        this.key=key;
        this.val=val;
        next=prev=null;
    }
}
class LRUCache {
    HashMap<Integer,Node> map;
    Node head;
    Node tail;
    int cap;

    private void insertAfterHead(Node node){
        Node nextNode=head.next;
        node.prev=head;
        head.next=node;
        node.next=nextNode;
        nextNode.prev=node;
    }
    private void deleteNode(Node node){
        Node prevNode=node.prev;
        Node nextNode=node.next;

        nextNode.prev=prevNode;
        prevNode.next=nextNode;
    }
    public LRUCache(int capacity) {
        map=new HashMap<>();
        cap=capacity;
        head=new Node();
        tail=new Node();

        head.next=tail;
        tail.prev=head;

    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node node=map.get(key);
        int val=node.val;

        deleteNode(node);
        insertAfterHead(node);
        return val;


    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;

            deleteNode(node);
            map.put(key,node);
            insertAfterHead(node);
            return;
        }

        if(map.size()>=cap){
            Node node=tail.prev;
            int val=node.key;

            map.remove(val);
            deleteNode(node);
        }
        Node newNode=new Node(key,value);
        map.put(key,newNode);
        insertAfterHead(newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */