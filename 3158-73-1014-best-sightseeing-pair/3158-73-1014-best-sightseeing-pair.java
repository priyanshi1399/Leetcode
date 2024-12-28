class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        if(values.length<2){
            return 0;
        }

        int n=values.length;
        int maxVal=values[0]+0;
        int answer=0;
        for(int j=1;j<n;j++){
            maxVal=Math.max(maxVal,values[j-1]+j-1);
            answer=Math.max(answer, maxVal+(values[j]-j));
        }
        return answer;

       /* if(values.length<2){
            return 0;
        }
        int n=values.length;
        int [] arr=new int[n];
        arr[0]=values[0]+0; //first value stored

        for(int i=1;i<n;i++){
            arr[i]=Math.max(values[i]+i,arr[i-1]); //Mainting previous Maximum Values
        }
        int answer=0;
        for(int j=1;j<n;j++){
               answer=Math.max(answer,values[j]-j+arr[j-1]);
            }
        return answer;*/
    }
}