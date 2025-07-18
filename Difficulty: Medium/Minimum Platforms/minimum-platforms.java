// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        int n=arr.length;
        int [][] pair=new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=arr[i];
            pair[i][1]=dep[i];
            
        }
        
        Arrays.sort(pair,Comparator.comparingInt(a->a[0]));
        int maxSize=1;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(pair[0][1]);
        for(int i=1;i<n;i++){
            while(!pq.isEmpty() && pq.peek()<pair[i][0]){
                pq.poll();
            }
            pq.add(pair[i][1]); 
            maxSize=Math.max(maxSize,pq.size());
        }
        return maxSize;
    }
}
