/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node prev=null;
        Node newHead=null;
        HashMap<Node,Node> map=new HashMap<>();

        Node curr=head;
        while(curr!=null){
            Node temp=new Node(curr.val); //make a node
            map.put(curr,temp); //store it
            if(newHead==null){
                newHead=temp;
                prev=newHead;
            }
            else{
                prev.next=temp;
                prev=prev.next;
            }
            curr=curr.next;
        }

        //now fill the random 

        curr=head;
        Node newCurr=newHead;
        while(curr!=null && newCurr!=null){
            if(curr.random==null){
                newCurr.random=null;
            }
            else{
                newCurr.random=map.get(curr.random);
            }
            curr=curr.next;
            newCurr=newCurr.next;
        }
        return newHead;
    }
}