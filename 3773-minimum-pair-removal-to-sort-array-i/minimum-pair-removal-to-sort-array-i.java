class Solution {
    public boolean checkNonDecreasing(List<Integer> arr){
        for(int i=0;i<arr.size();i++){
            if(i+1<arr.size() && arr.get(i)>arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        int op=0;
        while(!checkNonDecreasing(list)){
            int maxSum=Integer.MAX_VALUE;
            int index=-1;
            for(int i=0;i<list.size()-1;i++){
                    int sum=list.get(i)+list.get(i+1);
                    if(sum<maxSum){
                        maxSum=sum;
                        index=i;
                    }
            }
            list.remove(index+1);
            //list.remove(list.get(index));
            
            list.set(index,maxSum);
            
            op++;
        }
        return op;
        
    }
}