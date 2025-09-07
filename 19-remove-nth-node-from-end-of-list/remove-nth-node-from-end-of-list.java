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
            return null;
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
        if(fast==null){ //[1] n=1 case
            return head.next;
        }
        ListNode nodeToConnect=slow.next;
        slow.next=nodeToConnect.next;
        return head;


    }
}