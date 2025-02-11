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
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        mid=reverse(mid);

        ListNode start=head;
        
        int maxSum=Integer.MIN_VALUE;
        while(mid!=null){
            int sum=0;
           sum=start.val+mid.val;
           maxSum=Math.max(maxSum,sum);
           start=start.next;
            mid=mid.next;
        }
        return maxSum;

    }


    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode n=head;

        while(curr!=null){
            n=curr.next;
           curr.next=prev;
            prev=curr;
            curr=n;          
        }

        return prev;

    }
}