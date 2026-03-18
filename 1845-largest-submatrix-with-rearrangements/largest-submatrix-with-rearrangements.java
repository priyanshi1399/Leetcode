class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key,V value){
        this.key=key;
        this.value=value;
    }

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}
class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int result=0;
        List<Pair<Integer,Integer>> prevHeights=new ArrayList<>();

        for(int row=0;row<m;row++){
            List<Pair<Integer,Integer>> Heights=new ArrayList<>();
            boolean [] seen =new boolean[n];

            for(Pair<Integer,Integer> p: prevHeights){
                int height=p.getKey();
                int col=p.getValue();

                if(matrix[row][col]==1){
                    Heights.add(new Pair<Integer,Integer>(height+1,col));
                    seen[col]=true;
                }
            }

            //check whatever is left now in col which yiu ahve not seen
            for(int col=0;col<n;col++){
                if(!seen[col] && matrix[row][col]==1){
                    Heights.add(new Pair<Integer,Integer>(1,col));
                    seen[col]=true;
                }
            }

            //calculate the ARea
             for(int i=0;i<Heights.size();i++){
                int base=i+1;
                int height=Heights.get(i).getKey();
                result=Math.max(result,base*height);
        }
        
        prevHeights=Heights;
    }
    return result;
}
}