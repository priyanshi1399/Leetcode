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

    /*
     public int [] generateArray(int k,int s,int [] res){
        int [] newArray=new int[res.length+k];
        System.arraycopy(res,0,newArray,0,res.length);

       for(int i=0;i<k;i++){
        newArray[res.length+i]=s;
        }
    return newArray;
    }

    public int[] decompressRLElist(int[] nums) {
      //  int [] ans=new int[0];
        int [] res=new int[0];
        int n=nums.length;
        for(int i=0;i<n;i=i+2){
            res=generateArray(nums[i],nums[i+1],res);
        }
        return res;

    */
    }
}