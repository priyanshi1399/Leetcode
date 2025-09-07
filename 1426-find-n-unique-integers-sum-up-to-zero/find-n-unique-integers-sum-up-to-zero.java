class Solution {
    public int[] sumZero(int n) {
        int [] answer=new int[n];
        int index=0;
        for(int i=-n/2;i<=n/2;i++){
            if(n%2==0 && i==0){
                continue;
            }
            answer[index++]=i;
        }
        return answer;
    }
}