class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stck=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums2.length;
        for(int i=n-1;i>=0;i--){
            while(!stck.isEmpty() && nums2[stck.peek()]<=nums2[i]){
                stck.pop();
            }
            int ans=stck.isEmpty()?-1:nums2[stck.peek()];
            map.put(nums2[i],ans);
            stck.push(i);
        }

        int [] ans=new int[nums1.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;


    }
}