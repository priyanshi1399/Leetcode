class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        int [][] result=new int[n][2];

        for(int i=0;i<n;i++){
            result[i][0]=arr[i];
            result[i][1]=Integer.bitCount(arr[i]);
        }

        Arrays.sort(result,(a,b)->{
            if(a[1]!=b[1]){
                return Integer.compare(a[1],b[1]);
            }
            else {
                return Integer.compare(a[0],b[0]);
            }
        });

        for(int i=0;i<result.length;i++){
            arr[i]=result[i][0];
        }
        return arr;
    }
}