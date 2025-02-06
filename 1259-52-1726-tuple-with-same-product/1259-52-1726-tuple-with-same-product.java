class Solution {
   public int tupleSameProduct(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int prod=nums[i]*nums[j];
                map.put(prod,map.getOrDefault(prod,0)+1);
            }
        }
        int result=0;
        for(Map.Entry<Integer,Integer> ent:map.entrySet()){
            if(ent.getValue()>1){
                int freq=ent.getValue();
                freq=freq*(freq-1)/2;

                result=result+freq;
            }
        }
        return result*8;

    }
}
    /*public int tupleSameProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int tuple=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                HashSet<Integer> set=new HashSet<>();
                int prod=nums[i]*nums[j];
                for(int k=i+1;k<j;k++){
                    if(prod%nums[k]==0){
                        int dValue=prod/nums[k];
                    if(set.contains(dValue)){
                        tuple++;
                    }
                     set.add(nums[k]);
                    }
                   
                }
            }
        }
        return tuple*8;

    }
}
*/

/*public int tupleSameProduct(int[] nums) {
    Arrays.sort(nums);
    int n=nums.length;
    int tuple=0;
    for(int i=0;i<n;i++){
        for(int j=n-1;j>i;j--){
            for(int k=i+1;k<j;k++){
                for(int l=j-1;l>k;l--){
                    int prod1=nums[i]*nums[j];
                    int prod2=nums[k]*nums[l];
                    if(prod1==prod2){
                        tuple++;
                    }
                }
            }
        }
    }
    return tuple*8;
}
}*/
    /*public int tupleSameProduct(int[] nums) {
        int n=nums.length;
        int tuple=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=0;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(i!=k && i!=l && j!=k && j!=l){
                            int prod1=nums[i]*nums[j];
                            int prod2=nums[k]*nums[l];
                            if(prod1==prod2){
                                tuple++;
                            }
                        }
                        }
                    }
                }
            }

        return tuple/2*8;
    }
}*/