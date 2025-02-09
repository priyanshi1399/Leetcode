class NumberContainers {
    HashMap<Integer,Integer> idxToNum;
    HashMap<Integer,PriorityQueue<Integer>> numToIdx;
    public NumberContainers() {
        idxToNum=new HashMap<>();
        numToIdx=new HashMap<>();
    }
    
    public void change(int index, int number) {
        idxToNum.put(index,number);
        numToIdx.putIfAbsent(number,new PriorityQueue<>());
        numToIdx.get(number).add(index);
    }
    
    public int find(int number) {
      if(!numToIdx.containsKey(number)){
        return -1;
      }
    PriorityQueue<Integer> pq=numToIdx.get(number);
  //  System.out.println(pq);
      while(!pq.isEmpty()){
        int idx=pq.peek();

        if(idxToNum.get(idx)==number){
            return idx;
        }
        pq.poll();
      }
      return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */


 /*
class NumberContainers {
    HashMap<Integer,Integer> idxToNum;
    HashMap<Integer,TreeSet<Integer>> numToIdx;
    public NumberContainers() {
        idxToNum=new HashMap<>();
        numToIdx=new HashMap<>();

    }
    
    public void change(int index, int number) {
        if(idxToNum.containsKey(index)){
            int prevValue=idxToNum.get(index); //we will get number
            numToIdx.get(prevValue).remove(index);

            if(numToIdx.get(prevValue).isEmpty()){
                numToIdx.remove(prevValue);
            }
        }

        idxToNum.put(index,number);
        numToIdx.putIfAbsent(number,new TreeSet<>());
        numToIdx.get(number).add(index);
    }

    
    public int find(int number) {
        if(numToIdx.containsKey(number)){
            return numToIdx.get(number).first();
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */

 