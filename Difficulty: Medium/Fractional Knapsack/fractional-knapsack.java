class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n=values.length;
        int [][] pair=new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=values[i];
            pair[i][1]=weights[i];
            
        }
        Arrays.sort(pair,(a,b)->{
            double first=(double)a[0]/a[1];
            double second=(double)b[0]/b[1];
            if(second>first){
                return 1;
            }
            else if(first>second){
                return -1;
            }
            else{
                return 0;
            }
        });
        double totalValue=0.0;
        for(int i=0;i<n;i++){
            if(pair[i][1]<=W){
                totalValue+=pair[i][0];//adding the value
                W-=pair[i][1];
                
            }
            else{
                totalValue+=((double)pair[i][0]/pair[i][1])*W;
                break;
            }
        }
        return totalValue;
        
        
        
    }
}