class MinStack {
    private Stack<Long> stck;
    private long mini;
    private long newVal;
    private long topVal;
    public MinStack() {
        stck=new Stack<>();
    }
    
    public void push(int val) {
       if(stck.isEmpty()){
        stck.push((long)val);
        mini=val;
       } 
       else if(val<=mini){ //value is going to be in place of mini have to a new value
            stck.push(2*(long)val-mini);
            mini=val;
        }
        else{
            stck.push((long)val);
        }
       
    }
    
    public void pop() {
        newVal=stck.pop(); //storing because need to check if prevMin needs to be updated
        if(newVal<=mini){ //this value is changed
           mini=2*mini-newVal;  //newVal=2*val-min; //min=2*val-newVal;
        }
    }
    
    public int top() {
         topVal=stck.peek();
        if(topVal<=mini){ //changed val
            return (int)mini;
        }
        return (int)topVal;
    }
    
    public int getMin() {
        return (int) mini;
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