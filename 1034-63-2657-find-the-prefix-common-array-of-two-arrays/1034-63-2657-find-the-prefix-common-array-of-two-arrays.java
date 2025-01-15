class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=A.length;
         int [] res=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            if(map.get(A[i])==2){
                count++;
            }
            map.put(B[i],map.getOrDefault(B[i],0)+1);
            if(map.get(B[i])==2){
                count++;
            }

            res[i]=count;
        }
    return res;
     
    }
}