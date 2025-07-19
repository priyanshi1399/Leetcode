class MedianFinder {
    List<Integer> list;
    public MedianFinder() {
        list=new ArrayList<>();
    }
    
    public void addNum(int num) {
        int index=0;
        if(list.size()==0){
            list.add(num);
        }
        else if(num>=list.get(list.size()-1)){
            list.add(num);
        }
        else{
        int i=0;
        while(i<list.size()){
            while(i<list.size() && list.get(i)<=num){
                index=i;
                i++;
            }
            break;
        }
        if(i==list.size()){
            list.add(num);
        }
        else{
            list.add(i,num);
        }
        }
        
    }
    
    public double findMedian() {
        int size=list.size();
        double median;
        if(size%2==0){
            int middle=list.get(size/2);
            int middleNext=list.get((size/2)-1);
             median=((double)(middle+middleNext)/2);
        }
        else{
            int half=size/2;
            median=(double)list.get(size/2);
        }
        return median;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */