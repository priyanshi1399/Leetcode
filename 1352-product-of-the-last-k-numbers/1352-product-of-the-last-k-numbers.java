class ProductOfNumbers {
    List<Integer> lst;
    public ProductOfNumbers() {
        lst=new ArrayList<>();
        lst.add(1);
    }
    
    public void add(int num) {
        int n=lst.size();
        if(num==0){
            lst.clear();
            lst.add(1);
        }
        else{
            lst.add(lst.get(n-1)*num);
        }
    }
    
    public int getProduct(int k) {
        int n=lst.size();
        if(n-k-1<0){
            return 0;
        }
        else{
            return lst.get(n-1)/lst.get(n-k-1);
        }
        
    }
}

/*
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */


 /*
class ProductOfNumbers {
    LinkedList<Long> q1;
    public ProductOfNumbers() {
        q1=new LinkedList<>();
    }
    
    public void add(int num) {
        Long num1=Long.valueOf(num);
        q1.push(num1);
        System.out.println(q1);
    }
    
    public int getProduct(int k) {
        long multi=1;
        Long val=Long.valueOf(k);
        for(int i=1;i<=val;i++){
            long k1=q1.peek();
            multi=multi*(k1);
            q1.add(q1.poll());
        }
         long n=q1.size();
        for(int i=1;i<=n-k;i++){
            q1.add(q1.poll());
        }
        return (int)multi;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */ 


 