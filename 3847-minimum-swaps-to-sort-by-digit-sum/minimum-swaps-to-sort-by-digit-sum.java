class Solution {
    public int calculateSwaps(int [] nums,int [] original){
        int n=nums.length;
        int swaps=0;
        HashMap<Integer,Integer> mapToIndex=new HashMap<>();
        for(int i=0;i<n;i++){
            mapToIndex.put(nums[i],i);
        }
        boolean [] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]  || nums[i]==original[i]){
                continue;
            }

            int cycle_size=0;
            int j=i;
            while(!visited[j]){
                visited[j]=true;
                j=mapToIndex.get(original[j]);
                cycle_size++;
            }

            if(cycle_size>0){
                swaps+=cycle_size-1;
            }
        }
        return swaps;
    }
    public int calculateSum(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;
    }
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int [][] target=new int[n][2];
        for(int i=0;i<target.length;i++){
            target[i][0]=calculateSum(nums[i]);
            target[i][1]=nums[i];
         }

        Arrays.sort(target, (a,b)->{
            return a[0]==b[0]?Integer.compare(a[1],b[1]): Integer.compare(a[0],b[0]);
        });
        int [] original=new int[n];
        for(int i=0;i<n;i++){
            original[i]=target[i][1];
        }
        return calculateSwaps(nums,original);

    }
}