class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+m);
        }

        for(int i=0;i<m;i++){
            map.put(nums2[i],map.getOrDefault(nums2[i],0)+n);
        }
        List<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()%2!=0){
                res.add(entry.getKey());
            }
        }
        int XOR=0;
        for(int i=0;i<res.size();i++){
            XOR=XOR^res.get(i);
        }
        return XOR;
    }
} 
    /*public int xorAllNums(int[] nums1, int[] nums2) {
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
}*/