class Node{
    public int val,key;
    public Node next,prev;
    public Node(){
        val=key=-1;
        next=prev=null;
    }
    public Node(int key,int val){
        this.key=key;
        this.val=val;
        next=prev=null;
    }
}
class LRUCache {

    int cap;
    Map<Integer,Node> map;
    Node head;
    Node tail;
  
    public void deleteNode(Node node){
        Node prevNode=node.prev;
        Node nextNode=node.next;

        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }

    public void insertAfterHead(Node node){
     
        Node nextNode=head.next;
        node.prev=head;
        head.next=node;
        node.next=nextNode;
        nextNode.prev=node;

    }


    public LRUCache(int capacity) {
        cap=capacity;
        map=new HashMap<>();
        head=new Node();
        tail=new Node();
     
        //linking
        head.next=tail;
        tail.prev=head;

    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        Node node=map.get(key);
        int value=node.val;

        deleteNode(node);
        insertAfterHead(node);
        return value;

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
        else if(map.size()>=cap){
            Node node=tail.prev;

            int keyToRemove=node.key;
            map.remove(keyToRemove);
            deleteNode(node);
        }
        Node newNode=new Node(key,value);
        map.put(key,newNode);
        insertAfterHead(newNode);
        return;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */