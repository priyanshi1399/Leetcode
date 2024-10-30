class Solution {

    public ArrayList<Integer> appendToList(int freq,int val,ArrayList<Integer> arrlst){
       
        for(int i=0;i<freq;i++){
            arrlst.add(val);
        }
        return arrlst;
    }


    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
         ArrayList<Integer> lst=new ArrayList<>();
        for(int i=0;i<n;i=i+2){
        lst=appendToList(nums[i],nums[i+1],lst);
        }
        int [] res=new int[lst.size()];
        for(int i=0;i<res.length;i++){
            res[i]=lst.get(i);
        }

    return res;
    }
}