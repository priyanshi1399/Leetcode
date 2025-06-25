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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stck=new Stack<>();

        ListNode curr=head;
        while(curr!=null){
            stck.push(curr);
            curr=curr.next;
        }

        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(!stck.isEmpty()){
            temp.next=stck.pop();
            temp=temp.next;
        }
        temp.next=null;
        return dummy.next;
    }
}