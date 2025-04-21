class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=answers.length;
        for(int i=0;i<n;i++){
            map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }
        int total=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int x=entry.getKey();
            int count=entry.getValue();

            int groupSize=x+1; //there will be x+1 rabbits in one group
            int group=(int)Math.ceil((double)count/groupSize);

            total+=group*groupSize;
        }
        return total;
    }
}