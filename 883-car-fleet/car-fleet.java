class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    int n=position.length;
    if(n<2){
        return 1; //only one fleet will be there
    }
    int [][] pair=new int[n][2];
     for(int i=0;i<n;i++){
        pair[i][0]=position[i];
        pair[i][1]=speed[i];
    }

    Arrays.sort(pair,(a,b)->Integer.compare(a[0],b[0]));
    int carFleet=1;
    double time=(target-pair[n-1][0])/(1.0*pair[n-1][1]);
    for(int i=n-2;i>=0;i--){
    double t=(target-pair[i][0])/(1.0*pair[i][1]);
      if(t>time){
        time=t;
        carFleet++;
        
      }

    }
    return carFleet;

}
}