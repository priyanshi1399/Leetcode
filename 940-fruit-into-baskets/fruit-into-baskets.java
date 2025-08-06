class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruits=0;
        int left=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>(); //taken to store the fruit and freq
        int n=fruits.length;
        for(int right=0;right<n;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            if(map.size()<=2){ //basket shpuld not be greater than 2
                sum=0;
               for(int val:map.values()){
                sum+=val;
               }
                maxFruits=Math.max(maxFruits,sum);
            }

            while(map.size()>2){
                map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
        }
        return maxFruits;

    }
}