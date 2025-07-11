class MinStack {
    Stack<Integer> stck;
   List<Integer> minElement;
    public MinStack() {
        stck=new Stack<>();
        minElement=new ArrayList<>();
    }
    
    public void push(int val) {
        minElement.add(val);
        stck.push(val);
    }
    
    public void pop() {
        int val=stck.peek();
        stck.pop();
        minElement.remove(Integer.valueOf(val));
    }
    
    public int top() {

        return stck.peek();
    }
    
    public int getMin() {
        Collections.sort(minElement);

        return minElement.get(0);
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