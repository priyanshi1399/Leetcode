class Solution {
    public int[] sumZero(int n) {
        int [] answer=new int[n];
        int i=0;
        int j=n-1;
        int start=1;
        while(i<j){
            answer[i]=start;
            answer[j]=-start;
            start++;
            i++;
            j--;
        }
        return answer;
    }
}