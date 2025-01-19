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
        ListNode n=head;

        while(curr!=null){
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        return prev;

    }
    public int[] nextLargerNodes(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        Stack<Integer> stck=new Stack<>();
        List<Integer> res=new ArrayList<>();
        while(temp!=null){
            while(!stck.isEmpty() && temp.val>=stck.peek()){
                stck.pop();
            }

            if(stck.isEmpty()){
                res.add(0);
            }
            else{
                res.add(stck.peek());
            }

            stck.push(temp.val);
            temp=temp.next;
        }

        int index=0;
        int [] arr=new int[res.size()];
        for(int i=res.size()-1;i>=0;i--){
            arr[index]=res.get(i);
            index++;
        }
        return arr;

    }
}