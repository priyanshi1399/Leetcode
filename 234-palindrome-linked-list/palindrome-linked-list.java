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
        if(head==null){
            return true;
        }
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        ListNode fast=head;
        for(int i=1;i<size/2;i++){
            fast=fast.next;
        }
        ListNode half=fast.next;
        fast.next=null;
        ListNode res=reverse(half);
        ListNode temp1=head;
        ListNode temp2=res;
        while(temp1!=null && temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
    return true;
    }
}
