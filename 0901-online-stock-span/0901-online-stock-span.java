class StockSpanner {

    Stack<int []> stck;
    public StockSpanner() {
        stck=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!stck.isEmpty() && price>=stck.peek()[0]){
            span=span+stck.peek()[1];
            stck.pop();
        }
        stck.push(new int []{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */