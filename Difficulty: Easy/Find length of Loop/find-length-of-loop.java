/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        if(head==null){
            return 0;
        }
        int timer=1;
        HashMap<Node,Integer> map=new HashMap<>(); 
        Node curr=head;
        while(curr!=null){
            if(map.containsKey(curr)){
                int val=timer-map.get(curr);
                return val;
            }
            map.put(curr,timer);
            curr=curr.next;
            timer++;
        }
        return 0;
        
    }
}