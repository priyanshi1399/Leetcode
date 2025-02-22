class Solution {
     public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            if(nums[i].charAt(i)=='1'){
                str.append(0);
            }
            else{
                str.append(1);
            }
        }
        return str.toString();

     }
}
    /*public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();

        for(String num:nums){
            set.add(Integer.parseInt(num,2));
        }

        String res="";
        for(int i=0;i<=65536;i++){
            if(!set.contains(i)){
                res=Integer.toBinaryString(i);
                System.out.println(res);
                while(res.length()<n){
                    res="0"+res;
                }
                return res;
            }
        }
        return "";
        
        
    }
}*/