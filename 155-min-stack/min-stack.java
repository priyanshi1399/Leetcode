class MinStack {
    Stack<Long> stck;
    long mini;
    public MinStack() {
        stck=new Stack<>();
        mini=Long.MAX_VALUE;
    }
    
    public void push(int val) {
        if(stck.isEmpty()){
            stck.push((long)val);
            mini=val;
        }
        else if(val<mini){
            stck.push(2*(long)val-mini);
            mini=val;
        }
        else{
            stck.push((long)val);
        }
        
    }
    
    public void pop() {
        long x=stck.peek();
        if(x<mini){
        mini= 2*mini-x;
        stck.pop();
        }
        else{
            stck.pop();
        }
    }
    
    public int top() {
        long x=stck.peek();
        if(x<mini){
            return (int)mini;
        }
        return (int)x;
    }
    
    public int getMin() {
        return (int)mini;
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


 