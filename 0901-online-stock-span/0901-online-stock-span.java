class StockSpanner {

    Stack<int [] > stck;
    public StockSpanner() {
        stck=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!stck.isEmpty() && price>=stck.peek()[0]){
            span=span+stck.pop()[1];
        }
        stck.push(new int [] {price,span});
        return span;
    }
}


/*
stack=[]
nex(100)
stack=100,1]

next(80)
stack=[(100,1),(80,1)]
nex=60
stack=[(100,1),(80,1),(60,1)]
next(70)
stack=[(100,1),(80,1),(70,2)]
span=2

nex(60)
span=1
stack=[(100,1),(80,1),(70,2),(60,1)]

next(75)
span=4
stack=[(100,1),(80,1),(75,4)]

next(85)
span=1
stack=[(100,1),(85,6)]

*/
/*
class StockSpanner {
    //(60,1)--top
    //(80,1)
    //(100,1)


    //(70,2)
    //(80,1)
    //(100,1)

    //(75,4)
    //(80,1)
    //(100,1)

    //(70,1)
    //(85,6)
    //(100,1)

    //(90,8)
    //(100,1)
    Stack<int []> s1;
    public StockSpanner() {
        s1=new Stack<>();
    }
    
    public int next(int price) {
        int days=1;
        while(!s1.isEmpty() && price>=s1.peek()[0]){
            days+=s1.peek()[1];
            s1.pop();
        }
        s1.push(new int []{price,days});
        return days;
    }
    
}


*/

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */