class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n=boxTypes.length;
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
         for(int i=0;i<n;i++){
            System.out.println(boxTypes[i][0] +":"+boxTypes[i][1]);
            }
        int totalVal=0;
        for(int i=0;i<n;i++){
            if(boxTypes[i][0]<=truckSize){
                totalVal+=(boxTypes[i][0]*boxTypes[i][1]);
                truckSize-=boxTypes[i][0]; //no of boxes we have taken
                System.out.println(totalVal);
            }
            else{
              
                 totalVal+=(truckSize*boxTypes[i][1]);
                 // System.out.println(totalVal);
                 break;
            }
           
        }
        return totalVal;
    }
}