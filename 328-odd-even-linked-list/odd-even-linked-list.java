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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        List<Integer> res=new ArrayList<>();
        while(temp!=null && temp.next!=null){
            res.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null){
            res.add(temp.val);
        }
        temp=head.next;
        while(temp!=null && temp.next!=null){
            res.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null){
            res.add(temp.val);
        }
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
        ListNode curr=head;
        int i=0;
        while(curr!=null){
            curr.val=res.get(i);
            curr=curr.next;
            i++;
        }
        return head;
        
    }
}