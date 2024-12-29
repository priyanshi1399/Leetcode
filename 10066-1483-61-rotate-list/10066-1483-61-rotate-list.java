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
    public ListNode rotateRight(ListNode  head, int k) {
        if(head==null || k==0){
            return head;
        }
        ListNode temp=head;
        int length=1;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        System.out.println(length);
        temp.next=head; //added last to first
        k=k%length;

        for(int i=0;i<length-k;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;

    }
}