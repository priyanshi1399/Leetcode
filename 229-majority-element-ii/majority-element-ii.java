class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int count1=0;
        int count2=0;
        Integer majEle1=null;
        Integer majEle2=null;

        for(int i=0;i<n;i++){
            if(majEle1!=null && nums[i]==majEle1){
                count1++;
            }
            else if(majEle2!=null && nums[i]==majEle2){
                count2++;
            }
            else if(count1==0){
                majEle1=nums[i];
                count1++;
            }
            else if(count2==0){
                majEle2=nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        //verify at the last
        int freq1=0; //for majEle1
        int freq2=0; //for majEle2
        for(int num:nums){
            if(majEle1!=null && num==majEle1){
                freq1++;
            }
            if(majEle2!=null && num==majEle2){
                freq2++;
            }
        }
        List<Integer> res=new ArrayList<>();
        if(freq1>n/3){
            res.add(majEle1);
        }
        if(freq2>n/3){
            res.add(majEle2);
        }
        return res;

    }
}