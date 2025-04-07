class Router {
    int size;
    Queue<List<Integer>> q=new LinkedList<>();
    HashSet<List<Integer>> packet=new HashSet<>();
    Map<Integer, List<Integer>> packetDestinations=new HashMap<>();
    public Router(int memoryLimit) {
        this.size=memoryLimit;
    }
    
    public boolean addPacket(int source, int destination, int timestamp) {
        List<Integer> arr=new ArrayList<>(List.of(source,destination,timestamp));
        if(packet.contains(arr)){
            return false;
        }
        if(q.size()>=size){
            int val=q.peek().get(1);
            packet.remove(q.poll());
            List<Integer> tm=packetDestinations.get(val);
            tm.remove(0);
            if(tm.size()==0){
                packetDestinations.remove(val);
            }
        }      
        q.add(arr);
        packet.add(arr);
        if(!packetDestinations.containsKey(destination)){
            packetDestinations.put(destination,new ArrayList<>());
        }
        packetDestinations.get(destination).add(timestamp);
        return true;
    }
    
    public int[] forwardPacket() {
        if(q.isEmpty()){
            return new int []{};
        }
        List<Integer> arr=q.poll();
        packet.remove(arr);
        int des=arr.get(1);
            List<Integer>tm=packetDestinations.get(des);
            tm.remove(0); //removing first element from map
            if(tm.size()==0){
            packetDestinations.remove(des);
            }
       
        return new int []{arr.get(0),arr.get(1),arr.get(2)};
    }
    
    public int getCount(int destination, int startTime, int endTime) {
        if(!packetDestinations.containsKey(destination)){
            return 0;
        }
        return countIn(packetDestinations.get(destination),startTime,endTime);
    }
    public int countIn(List<Integer> arr, int s,int e){
        int left=lowerBound(arr,s);
        int right=upperBound(arr,e);

        return right-left;
    }
    public int lowerBound(List<Integer> arr, int target){
        int l=0;
        int h=arr.size();
        while(l<h){
            int mid=l+(h-l)/2;
            if(arr.get(mid)<target){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;
    }

     public int upperBound(List<Integer> arr, int target){
        int l=0;
        int h=arr.size();
        while(l<h){
            int mid=l+(h-l)/2;
            if(arr.get(mid)<=target){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;
    }


}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */