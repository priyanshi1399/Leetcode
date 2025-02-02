class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pairs.add(new Pair<>(entry.getValue(), entry.getKey()));
        }

        // Print pairs
        System.out.println(pairs);

        pairs.sort((a,b)->Integer.compare(b.getFirst(),a.getFirst()));

        int [] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pairs.get(i).getSecond();
        }
        return ans;
      
    }
}

public class Pair<F,S> {
    private final F first;
    private final S second;


    public Pair(F first, S second){
        this.first=first;
        this.second=second;

    }

    public F getFirst(){
        return first;
    }

    public S getSecond(){
        return second;
    }

    @Override
    public String toString(){
        return "(" + first + "," + second + ")";
    }

}