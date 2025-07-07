class Node{
    Node next,prev;
    int key,val;

    Node(){
        key=val=-1;
        next=prev=null;
    }
    Node(int key,int val){
        this.key=key;
        this.val=val;
        prev=next=null;
    }
}
class LRUCache {
    private HashMap<Integer,Node> map;
    private int cap;
    private Node head;
    private Node tail;

    private void InsertAfterHead(Node node){
        Node nextNode=head.next;
        node.next=nextNode;
        nextNode.prev=node;
        head.next=node;
        node.prev=head;

    }
    private void deleteNode(Node node){
        Node prevNode=node.prev;
        Node nextNode=node.next; //next node after node

       
        nextNode.prev=prevNode;
        prevNode.next=nextNode;

    }
    public LRUCache(int capacity) {
        map=new HashMap<>();
        cap=capacity;
        head=new Node();
        tail=new Node();

        //link make the connection
        tail.prev=head;
        head.next=tail;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node node=map.get(key);
        int value=node.val;

        deleteNode(node);

        InsertAfterHead(node);
        return value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;

            deleteNode(node);

            InsertAfterHead(node);
            map.put(key,node);
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

        InsertAfterHead(newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */