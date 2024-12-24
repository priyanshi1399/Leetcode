class Solution {



     public int countKConstraintSubstrings(String s, int k) {
        int left=0;
        int right=0;
        int zeroes=0;
        int ones=0;
        int count=0;

        while(right<s.length()){
            if(s.charAt(right)=='0'){
                zeroes++;
            }
            else{
                ones++;
            }

            while(zeroes>k && ones>k){
                if(s.charAt(left)=='0'){
                    zeroes--;
                }
                else{
                    ones--;
                }
                left++;
            }

            count=count+(right-left+1); //count all the substring
            right++;
        }
        return count;
     }
}

   /* public int countNumberOfOnes(String s){
        int count1=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            count1++;
        }
        }
        return count1;
    }
     public int countNumberOfZeroes(String s){
        int count2=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='0'){
            count2++;
        }
        }
        return count2;
    }

    public int countKConstraintSubstrings(String s, int k) {
        int n=s.length();
        int count=0;
        String str="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                str=s.substring(i,j+1);
               if(countNumberOfOnes(str) <=k || countNumberOfZeroes(str)<=k){
                count++;
               }
            }
        }
        return count;
    }
}
*/