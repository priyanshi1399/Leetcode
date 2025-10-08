class MinStack {

    Stack<Long> stck; 
    List<Integer> list;
    public void searchAndput(List<Integer> list,int val){
        int l=0;
        int r=list.size()-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(list.get(mid)==val){
                list.add(mid-1,val);
                return;
            }
            else if(list.get(mid)>val){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        list.add(l,val);
    }
    public MinStack() {
        stck=new Stack<>();
        list=new ArrayList<>();
    }
    
    public void push(int val) {
        stck.push((long)val);
        if(list.isEmpty()){
            list.add(val);
        }
        else if(list.get(0)>=val){
            list.add(0,val);
        }
        else if(list.get(list.size()-1)>=val){
            list.add(val);
        }
        else{
            searchAndput(list,val);
        }
    }
    
    public void pop() {
        long valueToPop=stck.peek();
        stck.pop();
        list.remove(Integer.valueOf((int)valueToPop));
    }
    
    public int top() {
            long top=stck.peek();
            return (int) top;
    }
    
    public int getMin() {
        return list.get(0);
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