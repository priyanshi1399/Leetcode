class ProductOfNumbers {

    List<Integer> lst;
    int n;
    public ProductOfNumbers() {
        lst=new ArrayList<>();
        n=0;
    }
    
    public void add(int num) {
        if(num==0){
            lst.clear();
            n=0;
        }
        else{
        if(n==0){
            lst.add(num);
        } 
        else{
        lst.add(lst.get(n-1)*num);
        }
        n++;
        }
    }
    
    public int getProduct(int k) {
        if(n<k){
            return 0;
        }
        else if(n==k){
            return lst.get(n-1);
        } 
       
        return lst.get(n-1)/lst.get(n-k-1);
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */