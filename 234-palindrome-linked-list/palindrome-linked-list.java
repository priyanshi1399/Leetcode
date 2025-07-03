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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode n=null;
        while(curr!=null){
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }

        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode half=slow.next; //slow will be at middle
        slow.next=null;
        ListNode reverseHalf=reverse(half); //sending half node for reverse
        
        ListNode curr1=head;
        ListNode curr2=reverseHalf;

        while(curr1!=null && curr2!=null){
            if(curr1.val!=curr2.val){
                return false;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return true;

    }
}