class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int XOR1=nums1[0];
        int XOR2=nums2[0];
        for(int i=1;i<n;i++){
            XOR1=XOR1^nums1[i];
            System.out.println(XOR1);
        }
        int value1=XOR1;
        for(int i=0;i<m-1;i++){
            value1=value1^XOR1;
        }

         for(int i=1;i<m;i++){
            XOR2=XOR2^nums2[i];
        }
        int value2=XOR2;
        for(int i=0;i<n-1;i++){
            value2=value2^XOR2;
        }

        int ans=value1^value2;
        return ans;

    }
}