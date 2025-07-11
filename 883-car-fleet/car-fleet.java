class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int [][] pair=new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }

        Arrays.sort(pair,(a,b)->Integer.compare(a[0],b[0]));
        double time=(target-pair[n-1][0])/(1.0*pair[n-1][1]);
        int count=1; //taken first already 
        for(int i=n-2;i>=0;i--){
            double t=(target-pair[i][0])/(1.0*pair[i][1]);
            System.out.println(t);
                if(t>time){
                    time=t;
                    count++;
                }
            }
        return count;
    }
}
