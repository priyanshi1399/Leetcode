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
        if(n==0 || head==null){
            return null; //base case
        }
        ListNode fast=head;
    
        while(n>0){
            fast=fast.next;
            n--;
        }
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        if(fast==null){
            return head.next;
        }
        ListNode deletNode=slow.next;
        slow.next=deletNode.next;
        return head;

    }
}