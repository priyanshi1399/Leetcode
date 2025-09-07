class Solution {
    public int[] sumZero(int n) {
        int [] answer=new int[n];
        int start=1;
        int i=0;
            while(i<n){
                if(i+1<n){
                    answer[i]=start;
                    answer[i+1]=-start;
                }
                i+=2;
                start++;
            }
            return answer;
    }
}