class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0;
        long sum2=0;
        long zeroInNums1=0;
        long zeroInNums2=0;
        for(int i=0;i<nums1.length;i++){
            sum1+= nums1[i]==0?1:nums1[i];
            zeroInNums1+=nums1[i]==0?1:0;
        }

        for(int i=0;i<nums2.length;i++){
            sum2+= nums2[i]==0?1:nums2[i];
            zeroInNums2+=nums2[i]==0?1:0;
        }

        if(sum1<sum2 && zeroInNums1==0 || sum2<sum1 && zeroInNums2==0 ){
            return -1;
        }
        return Math.max(sum1,sum2);

    }
}