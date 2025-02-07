class Solution {
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
    int [] maxToRight=new int[n];
    maxToRight[n-1]=nums[n-1];
    for(int i=n-2;i>=0;i--){
        maxToRight[i]=Math.max(maxToRight[i+1],nums[i]); //maintained the maximum to right elements Array
    }
    int maxValue=0;
    int i=0;
    int j=0;
    while(j<n){
        if(nums[i]<=maxToRight[j]){
            maxValue=Math.max(maxValue,j-i);
            j++;
        }
        else{
            i++;
        }
    }
    return maxValue;

    }
}
    /*public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        Stack<Integer> stck=new Stack<>();
        int maxValue=0;
        for(int i=0;i<n;i++){
        for(int j=n-1;j>i;j--){
            if(nums[i]<=nums[j]){
                maxValue=Math.max(maxValue,j-i);
                break;
            }   
        }          
        }
        return maxValue;
    }
}*/