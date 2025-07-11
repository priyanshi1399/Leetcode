class MinStack {
    Stack<Integer> stck;
    Stack<Integer> minStack;;
    public MinStack() {
        stck=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int val) {
        stck.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }
        else{
            if(val<=minStack.peek()){
                minStack.push(val);
            }
        }
        
    }
    
    public void pop() {
        int x=stck.pop();
        if(minStack.peek()==x){
            minStack.pop();
        }
    }
    
    public int top() {
        return stck.peek();
    }
    
    public int getMin() {
        return minStack.peek();
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