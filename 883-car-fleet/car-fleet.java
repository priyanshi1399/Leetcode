class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        if(n<2){
            return 1;
        }
        int [][] pair=new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }

        Arrays.sort(pair,(a,b)->Integer.compare(a[0],b[0]));

        Stack<Double> stck=new Stack<>();
        for(int i=n-1;i>=0;i--){
            double t=(target-pair[i][0])/(1.0*pair[i][1]);
            if(stck.isEmpty()){
                stck.push(t);

            }
            else{
                if(t>stck.peek()){
                    stck.push(t);
                }
            }
        }
        return stck.size();
    }
}
