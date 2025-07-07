class Node{
    Node next,prev;
    int key,val;

    Node(){
        key=val=-1; //to avoid null pointer  act like dummy
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
        Node prevNode=node.prev; //node before  Node prev 
        Node nextNode=node.next; //next node after node

        //connecting both after deleting
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

        Node node=map.get(key); //getting node
        int value=node.val; //getting the value of the node

        deleteNode(node); //because now it will come at the place of most used after head

        InsertAfterHead(node); //insert after head
        return value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key); //get the node
            node.val=value; //update with new value

            deleteNode(node); //delete beacuse it will come most frequently used not recently

            InsertAfterHead(node); //insert after the head
            map.put(key,node); //insert updated value to map
            return;

        }

        if(map.size()>=cap){

            Node node=tail.prev; //get node from prev

            int val=node.key; //get the val means to remove the key from the map

            map.remove(val); //remove from the map

            deleteNode(node); //delete beacuse its not there

        }

        Node newNode=new Node(key,value); //create new Node
 
        map.put(key,newNode); //put into map

        InsertAfterHead(newNode); //Insert at the most used.
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */