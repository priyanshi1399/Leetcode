class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stck=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stck.isEmpty() && nums2[stck.peek()]<=nums2[i]){
                stck.pop();
            }
            if(stck.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],nums2[stck.peek()]);
            }
           
            stck.push(i);
            
        }
        int [] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}