class Solution {
   int n;

    public int makeEveryElement1(int [] temp,int k,int val){ 
       int op = 0;
        for (int i = 0; i < n - 1; i++) {
            if (temp[i] != val) {
                temp[i] *=-1;
                temp[i + 1] *=-1;
                op++;
                if (op > k) {
                    return Integer.MAX_VALUE; 
                }
            }
        }
        if (temp[n - 1] != val) {
            return Integer.MAX_VALUE;
        }
        return op;

        
    }
    public boolean canMakeEqual(int[] nums, int k) {
        n=nums.length;
         int[] temp1 = nums.clone(); // copy for val = 1
        int[] temp2 = nums.clone(); // copy for val = -1

        return ((makeEveryElement1(temp1,k,1)<=k) || (makeEveryElement1(temp2,k,-1)<=k)); 


    }
}
