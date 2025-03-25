class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        int start=0;
        int end=0;
        int result=0;
        for(int i=0;i<meetings.length;i++){
            if(meetings[i][0]>end){ //that means gap is there
                result+=(meetings[i][0]-end)-1;
            }
            end=Math.max(end,meetings[i][1]); //updating maxValue of the interval
        }

        if(end<days){
            result+=days-end; //left out days from the last
        }
        return result;
    }
}