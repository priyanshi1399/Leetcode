class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxFruits=0;
        int i=0;
        for(int j=0;j<n;j++){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            if(map.size()<=2){
                sum=0;
                for(int value: map.values()){
                    sum+=value;
                }
                maxFruits=Math.max(maxFruits,sum);
            }
            if(i<n && map.size()>2){
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i])==0){
                    map.remove(fruits[i]);
                }
                i++;
            }

        }
        return maxFruits;
    }
}