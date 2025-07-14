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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        StringBuilder str=new StringBuilder();
        while(temp!=null){
            str.append(temp.val);
            temp=temp.next;
        }
        String ans=str.reverse().toString();
        int n=ans.length();
        int [] power=new int[n];
        power[0]=1;
        for(int i=1;i<n;i++){
            power[i]=power[i-1]*2;
        }
        int res=0;
        for(int i=0;i<n;i++){
            char ch=ans.charAt(i);
            if(ch=='1'){
                res+=1*power[i];
            }
        }
        return res;



    }
}