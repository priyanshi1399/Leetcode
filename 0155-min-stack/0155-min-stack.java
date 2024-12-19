class MinStack {

    private Stack<int [] >stck;
    public MinStack() {
        stck=new Stack<>();
    }
    
    public void push(int val) {
        if(stck.isEmpty()){
            stck.push(new int []{val,val});
            return;
        }
    int mini=Math.min(getMin(),val);
    stck.push(new int []{val,mini});

    }
    
    public void pop() {
        stck.pop();
    }
    
    public int top() {
        return stck.peek()[0];
    }
    
    public int getMin() {
        return stck.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */