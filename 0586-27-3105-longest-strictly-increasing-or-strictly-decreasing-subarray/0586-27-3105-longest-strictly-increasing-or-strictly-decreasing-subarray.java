class Solution {

    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int increasing=1;
        int decreasing=1;
        int result=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                increasing++;
                decreasing=1;
                result=Math.max(result,increasing);
            }
           

            else if(nums[i-1]>nums[i]) {
                decreasing++;
                increasing=1;
                result=Math.max(result,decreasing);
            }
            else{
                decreasing=1;
                increasing=1;
            }
            
           
        }
        return result;
    }
}

    /*public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int result=0;
        for(int i=0;i<n;i++){
           int increasing=1;
           int j=i+1;

            while(j<n && nums[j-1]>nums[j]){
                increasing++;
                j++;
            }

            j=i+1;
            int decreasing=1;
            while(j<n && nums[j-1]<nums[j]){
                decreasing++;
                j++;
            }

            result=Math.max(result,Math.max(increasing,decreasing)); 

        }
        return result;


    }
}

*/
    /*public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int increaseLen=1;
        int decreaseLen=1;
        int i=0;
        int j=0;
        while(i<n){
            for(j=i;j<n;j++){
                if(j+1<n && nums[j]<nums[j+1]){
                    increaseLen=Math.max(increaseLen,((j+1)-i)+1);
                    System.out.println("the increaseLen is"+increaseLen);
                }
                else{
                    break;
                }
            }
            i=j+1;
        }
        i=0;
        while(i<n){
            for(j=i;j<n;j++){
                if(j+1<n && nums[j]>nums[j+1]){
                    decreaseLen=Math.max(decreaseLen,((j+1)-i)+1);
                    System.out.println("the decreaseLen is"+decreaseLen);
                }
                else{
                    break;
                }
            }
            i=j+1;
        }

        return Math.max(increaseLen,decreaseLen);



    }
}*/