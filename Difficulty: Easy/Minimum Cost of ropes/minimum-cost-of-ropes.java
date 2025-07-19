class Solution {
    public static int minCost(int[] arr) {
        int n=arr.length;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        } 
           int sum=0;
            while(!pq.isEmpty() && pq.size()>1){
                int A=pq.poll();
                int B=pq.poll();
                sum+=A+B;
                pq.add(A+B);
            }
        return sum;
        
    }
}