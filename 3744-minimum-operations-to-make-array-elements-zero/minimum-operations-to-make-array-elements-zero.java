class Solution {
    public long noOfOperation(int l,int r){
        //define the range as L=1 and R=3 for 1st Steps wiull be 1
        //then L=4 and R=15 Steps=2 ..this is pattern which we recognize
        //then L=16 and R=63 Steps=3 ..this is pattern which we recognize

        long L=1;
        long S=1; //steps for first is 1..2..3...
        long op=0;
        while(L<=r){ //inside the range 
            long R=4*L-1; //R will be changing
            long start=Math.max((long) l,L);
            long end=Math.min((long)r,R);
            

            if(start<=end){ //[(13,16)] start=13 end=3 move ahead
            op+=(end-start+1)*S;
            }
            L=4*L;
            S++; //increase the steps
        }
        return op;


    }
    public long minOperations(int[][] queries) {
        long steps=0;

        for(int [] q: queries){
            int l=q[0];
            int r=q[1];
            long ans=noOfOperation(l,r); //take 2 number at a time so we have to divide by 2

            steps+=(ans+1)/2;
        }
        return steps;
    }
}