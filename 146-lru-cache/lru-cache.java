class ListNode{
    public ListNode next,prev;
    public int key,  val;

    ListNode(){
        key=val=-1;
        next=prev=null;
    }
    ListNode (int key, int val){
        this.key=key;
        this.val=val;
        prev=next=null;
    }
}
class LRUCache {
    private ListNode head;
    private ListNode tail;
    private HashMap<Integer,ListNode> map;
    private  int cap;
    
    private void InsertAfterHead(ListNode node){
        ListNode nextNode = head.next;
        head.next = node;
        nextNode.prev = node;
        node.prev = head;
        node.next = nextNode;
        
    }

    

    private void deleteNode(ListNode node){
        ListNode nextNode=node.next;
        ListNode prevNode=node.prev;

        nextNode.prev=prevNode;
        prevNode.next=nextNode;
    }

    public LRUCache(int capacity) {
        head=new ListNode();
        tail=new ListNode();
        map=new HashMap<>();
        cap=capacity;

        //make the connection
        head.next=tail;
        tail.prev=head;

    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        ListNode node=map.get(key); //getting the address so that we can get the data
        int value=node.val;
        //before getting value we have to delete that node from tail ans insert at head next beacuse it is recently used
        deleteNode(node);
       
        //became recently used
        InsertAfterHead(node);
        return value;

    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            ListNode node=map.get(key); //get the node 
            node.val=value; //updating the value

            //we have to delete from DLL
            deleteNode(node);
            //insert after head also because it is  most recently used

            InsertAfterHead(node);

            map.put(key,node);
            return;
           
        }

        if(map.size()>=cap){
            ListNode node=tail.prev; //get the node which is least recently used
            map.remove(node.key);

            deleteNode(node); //delete the node

        }

        ListNode newNode=new ListNode(key,value);

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