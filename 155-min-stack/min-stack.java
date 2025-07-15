class MinStack {
    Stack<Integer> stck;
    Stack<Integer> minStack;
    public MinStack() {
        stck=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int val) {
        stck.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }
        else if(val<=minStack.peek()){
            minStack.push(val);
        }
        

    }
    
    public void pop() {
        if(!stck.isEmpty()){
            int x=stck.peek();
            stck.pop();
            if(minStack.peek()==x){
                minStack.pop();
            }
    }
    }
    
    public int top() {
        if(!stck.isEmpty()){
            return stck.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return -1;
        
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