class ListNode{
    String data;
    ListNode prev;
    ListNode next;

    ListNode(String data){
        this.data=data;
    }

    ListNode(String data,ListNode prev,ListNode next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }


}
class BrowserHistory {
    ListNode curr;
    public BrowserHistory(String homepage) {
        curr=new ListNode(homepage);
    }
    
    public void visit(String url) {
        ListNode newNode=new ListNode(url);
        curr.next=newNode;
        newNode.prev=curr;
        curr=curr.next;
    }
    
    public String back(int steps) {
        while(curr.prev!=null && steps>0){
            curr=curr.prev;
            steps--;
        }
        return curr.data;
    }
    
    public String forward(int steps) {
         while(curr.next!=null && steps>0){
            curr=curr.next;
            steps--;
        }
        return curr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */