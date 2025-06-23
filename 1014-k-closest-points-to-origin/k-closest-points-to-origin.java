class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n=points.length;
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));

        for(int i=0;i<n;i++){
            int x1=points[i][0];
            int y1=points[i][1];
            int dist=x1*x1+y1*y1;
            pq.add(new int []{dist,x1,y1});

            while(pq.size()>k){
                pq.poll();
            }
        }

        int [][] ans=new int[pq.size()][2];
        int idx=0;
        while(!pq.isEmpty()){
            int [] curr=pq.poll();
            ans[idx][0]=curr[1];
            ans[idx][1]=curr[2];
            idx++;
        }

        return ans;
    }
}