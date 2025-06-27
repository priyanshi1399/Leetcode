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
        int timer=1;
        HashMap<Node,Integer> map= new HashMap<>();
        
        Node curr=head;
        while(curr!=null){
            if(map.containsKey(curr)){
                int val=map.get(curr);
                return timer-val;
            }
            
            map.put(curr,timer);
            timer++;
            curr=curr.next;
        }
        return 0;
    }
}