class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=A.length;
        int count=0;
        int [] res=new int[n];
        for(int i=0;i<n;i++){
          if(map.containsKey(A[i])){
            map.put(A[i],map.get(A[i])+1);
          }
          else{
            map.put(A[i],1);
          }
         if(map.get(A[i])==2){
            count++;
         }   
         if(map.containsKey(B[i])){
            map.put(B[i],map.get(B[i])+1);
          }
          else{
            map.put(B[i],1);
          }
         if(map.get(B[i])==2){
            count++;
         } 

         res[i]=count;  
        }
        return res;
    }
}