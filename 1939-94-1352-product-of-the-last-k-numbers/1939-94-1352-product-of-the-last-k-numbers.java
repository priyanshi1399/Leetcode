class ProductOfNumbers {

    List<Integer> lst;
    public ProductOfNumbers() {
        lst=new ArrayList<>();
        lst.add(1);
    }
    
    public void add(int num) {
        if(num==0){
           lst.clear();
            lst.add(1);
        }
        else{
            lst.add(lst.get(lst.size()-1)*num);
        }
    }
    
    public int getProduct(int k) {
        int n=lst.size();
        if(n-k-1<0){
            return 0;
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