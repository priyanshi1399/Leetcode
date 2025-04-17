class Solution {
    public int GCD(int n1,int n2){
        while(n1!=0 && n2!=0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        if(n1==0){
            return n2;
        }
        return n1;
    }
    public int countPairs(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,List<Integer>> indices=new HashMap<>();
        for(int i=0;i<n;i++){
            indices.computeIfAbsent(nums[i],p->new ArrayList<>()).add(i);
        }
        //calculating factors
        Set<Integer> factors=new HashSet<>();
        for(int f=1;f*f<=k;f++){ //36 1,2,3,6
            if(k%f==0){
                factors.add(f);
                factors.add(k/f);
            }
        }
        int result=0;
        for(List<Integer> index: indices.values()){
            Map<Integer,Integer> factorsMap=new HashMap<>();
            for(int i: index){
                int gcd=GCD(i,k);
                int j=k/gcd;
                if(factorsMap.containsKey(j)){
                    result+=factorsMap.get(j);
                }
            
                for(int f: factors){
                    if(i%f==0){
                        factorsMap.put(f,factorsMap.getOrDefault(f,0)+1);
                    }
                }
        }
    }
    return result;
    }
}