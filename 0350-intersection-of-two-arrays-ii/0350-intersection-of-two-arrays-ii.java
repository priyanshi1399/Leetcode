class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        while(i< nums1.length && j< nums2.length){
            if(nums1[i]==nums2[j]){
                res.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int [] ans=new int[res.size()];
        for(i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
    return ans;
    }
}