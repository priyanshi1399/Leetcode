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
        if(head==null || head.next==null){
            return null;
        }
        ListNode fast=head;
        while(n!=0){
            n--;
            fast=fast.next; //take fast till prev point
        }

        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        if(fast==null){
            return head.next;
        }

        ListNode nodeToDelete=slow.next;
        slow.next=slow.next.next;
        return head;


    }
}