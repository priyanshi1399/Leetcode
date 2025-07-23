class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    int n=position.length;
    if(n<2){
        return 1; //only one fleet will be there
    }
    int [][] pair=new int[n][2];
    Stack<Double> stck=new Stack<>();
     for(int i=0;i<n;i++){
        pair[i][0]=position[i];
        pair[i][1]=speed[i];
    }

    Arrays.sort(pair,(a,b)->Integer.compare(a[0],b[0]));

    for(int i=n-1;i>=0;i--){
        int pos=pair[i][0];
        int sp=pair[i][1];
        double t=1.0*(target-pos)/sp; // time=distance/spped
        if(stck.isEmpty()){
            stck.push(t); //1 fleet
        }

        
        else{
            if(t>stck.peek()){ //it can't catch up
                stck.push(t);
            }
        }
    }
    return stck.size();

}
}