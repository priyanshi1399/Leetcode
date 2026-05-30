class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int []> stck=new Stack<>();
        for(int i=0;i<n;i++){
            if(stck.isEmpty() || intervals[i][0]>stck.peek()[1]){ //8>6
                    stck.push(intervals[i]);
            }
            else{
                stck.peek()[1]=Math.max(stck.peek()[1],intervals[i][1]);
            }
        }
        int [][] result=new int[stck.size()][2];
        int index=0;
        while(!stck.isEmpty()){
            result[index][0]=stck.peek()[0];
            result[index][1]=stck.peek()[1];
            stck.pop();
            index++;

        }
        return result;
    }
}