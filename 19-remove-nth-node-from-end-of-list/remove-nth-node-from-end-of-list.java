/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        while(n!=0){
            n--;
            fast=fast.next; //move fast till previous point 
            
        }

        // slow and fast will move simultaneously
        if(fast==null){ //when n==size
            return head.next;
        }
        ListNode slow=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode deleteNode=slow.next; //store the node to delete
        slow.next=slow.next.next;
        return head;

    }
}