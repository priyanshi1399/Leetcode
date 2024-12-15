class MyStack {

    Queue<Integer> q;
    public MyStack() {
    q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x); //add 1 and add 2 then remove 1 put after 2
        int n=q.size(); //2
        for(int i=1;i<=n-1;i++){
            q.add(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */