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
            return head;
        }
        Node curr=head;
        //inserting node in between
        while(curr!=null){ //A-->B
            Node nextNode=curr.next; //store it because we have to connect after
            curr.next=new Node(curr.val);
            curr.next.next=nextNode;
            curr=nextNode; //now curr is at nextNode
        }

        // fill the random
        curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.random==null){
                curr.next.random=null;
            }
            else{
                curr.next.random=curr.random.next; //go to curr's random then go to next
            }
            curr=curr.next.next;
        }

        //sepearte list to get the answer
        curr=head;
        Node newHead=curr.next;
        Node newCurr=newHead;

        while(curr!=null && newCurr!=null){
            curr.next=(curr.next!=null)?curr.next.next:null;
            newCurr.next=(newCurr.next!=null)?newCurr.next.next:null;

            curr=curr.next;
            newCurr=newCurr.next;
        }
        return newHead;


    }
}