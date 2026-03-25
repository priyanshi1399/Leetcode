class Solution {
    public boolean uniformArray(int[] nums1) {
        int minNum=Integer.MAX_VALUE;
        int n=nums1.length;
        for(int i=0;i<n;i++){
            minNum=Math.min(minNum,nums1[i]);
        }

        if(minNum%2==1){
            return true; //if smallest is odd then even-odd=odd
        }

        for(int i=0;i<n;i++){
            if(nums1[i]%2==1){
                return false; //in even case if any number you found odd wrong because odd-even =odd no way we can make evne [4,3,2,8,9] smallest 2 even fine but 9-2=7 cannot make even
            }
        }
        return true;
    }
}