class MinStack {
    long mini=Long.MAX_VALUE;
    Stack<Long> stck;
    public MinStack() {
        stck=new Stack<>();
    }
    
    public void push(int value) {
        Long val=Long.valueOf(value);
        if(stck.isEmpty()){
            mini=val; //min=12
            stck.push(val); //st[12]
        }
        else if(!stck.isEmpty()){
            if(val>mini) { //15 >12
            stck.push(val);      // we dont have to update the min just store  st[12,15]
        }
        else{
            stck.push(2*val-mini); // val=10 10<12  push (8) st[12,15,8]
            mini=val; //update the min to 10, min=10
        }
        }
    }
    
    
    public void pop() {
        if(stck.isEmpty()){
            return;
        }
        long x=stck.peek(); //  st[15,12,8]  x= 8  
        stck.pop(); //pop(8) but we have to pop the 10 in real and our min will be previous value i.e. 12
        if(x<mini){ //8 <10
        mini=(2*mini)-x; //2*10-8 =12
        }
    }
    
    public int top() {
        if(stck.isEmpty()){
            return -1;
        }
        long x=stck.peek(); //x=8
        if(x>mini){ //15>12
            return (int)x;
        }
        else{
            return (int)mini; // 10<12
        }
    }
    
    public int getMin() {
        return (int)mini;
    }
}

/*
This was o(2*n) because we were storing two element and we have to optimize it
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




*/

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */