class MedianFinder {
    PriorityQueue<Integer> leftMaxHeap;
    PriorityQueue<Integer> rightMinHeap;
    public MedianFinder() {
        leftMaxHeap=new PriorityQueue<>(Collections.reverseOrder());
        rightMinHeap=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(leftMaxHeap.isEmpty() || num<leftMaxHeap.peek()){
            leftMaxHeap.add(num);
        }
        else{
            rightMinHeap.add(num);
        }

        // we have to maintain the size of the heaps leftMaxHeap should be one greater or both should be equal
        if(Math.abs(leftMaxHeap.size()-rightMinHeap.size())>1){ //untill its not greater than 1
            //take elment from the leftMaxHeap and add it to rightMinHeap
            rightMinHeap.add(leftMaxHeap.poll());
        } 
        // if leftMaxHeap<rightMinHeap it should be there
        else if(leftMaxHeap.size()<rightMinHeap.size()){
             leftMaxHeap.add(rightMinHeap.poll());
        }

    }
    
    public double findMedian() {
        //if size are euqual that means take top from both
        if(leftMaxHeap.size()==rightMinHeap.size()){
            double mean= ((double)(leftMaxHeap.peek()+rightMinHeap.peek())/2);
            return mean;
        }
        return (double)leftMaxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */