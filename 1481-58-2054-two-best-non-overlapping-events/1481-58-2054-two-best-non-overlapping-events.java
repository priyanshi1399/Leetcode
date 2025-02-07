class Solution {
    public int maxTwoEvents(int[][] events) {
        int n=events.length;
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));

        int [] maxVal=new int[n];
        maxVal[n-1]=events[n-1][2];
        for(int i=n-2;i>=0;i--){
            maxVal[i]=Math.max(maxVal[i+1],events[i][2]);
        }

        int result=0;
        for(int i=0;i<n;i++){
            int currVal=events[i][2];
            result=Math.max(result,currVal);

            int low=i+1;
            int high=n-1;
            int nextEvent=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(events[mid][0]>events[i][1]){
                    nextEvent=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            if(nextEvent!=-1){
                result=Math.max(result,currVal+maxVal[nextEvent]);
            }
        }
        return result;
    }
}