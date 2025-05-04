class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int [] arr=new int[100];
        int result=0;
        for(int [] d:dominoes){
            if(d[0]>d[1]){
                int temp=d[0];
                d[0]=d[1];
                d[1]=temp;
            }

            int num= d[0]*10+d[1];
            result+=arr[num];
            arr[num]++;
        }
        return result;
    }
}