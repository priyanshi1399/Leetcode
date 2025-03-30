class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n=nums.size();
        //finding majority Element
        int count=1;
        int majEle=nums.get(0);
        for(int i=1;i<n;i++){
            if(count==0){
                majEle=nums.get(i);
                count=1;
            }
            else if(nums.get(i)==majEle){
                count++;
            }
            else{
                count--;
            }
        }
        //counting majority Element count
        int majCount=0;
        for(int i=0;i<n;i++){
            if(nums.get(i)==majEle){
                majCount++;
            }
        }
        
        System.out.println("Majority and count is: "+majEle +":" +majCount);
        int remainingCount=0;
        for(int i=0;i<n;i++){
            if(nums.get(i)==majEle){
                remainingCount++;
                int n1=i+1;
                int n2=n-i-1;
                if(remainingCount *2>(n1) && (majCount-remainingCount) *2>(n2)){
                    return i;
                }
            }
        }
        return -1;
    }
}