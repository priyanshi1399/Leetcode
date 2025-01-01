class Solution {

    int zeroes=0;
    int ones=0;
    int maxCount=Integer.MIN_VALUE;
    public int maxScore(String s) {
        int n=s.length();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0'){
                zeroes++;
            }
            else{
                ones++;
            }

            maxCount=Math.max(maxCount,(zeroes-ones));
        }
        if(s.charAt(n-1)=='1'){
            ones++;
        }
        return maxCount+ones;
    }
}

 /*public int maxScore(String s) {
    int n=s.length();
    int totalOnes=0;
    for(int i=0;i<n;i++){
        if(s.charAt(i)=='1'){
            totalOnes++;
        }
    }


    int zeroes=0;
    int ones=0;
    int onesAtLeft=0;
    int maxCount=Integer.MIN_VALUE;
    for(int i=0;i<n-1;i++){
        if(s.charAt(i)=='0'){
            zeroes++;
        }
        else{
            ones++;
        }
        int onesAtRight=totalOnes-ones;
        maxCount=Math.max(maxCount,zeroes+onesAtRight);

    }
    return maxCount;

}
}*/


   /* public int countZeros(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                count++;
            }
        }
        return count;
    }

    public int countOnes(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
    public int maxScore(String s) {
        int answer=Integer.MIN_VALUE;
        int n=s.length();
        for(int i=0;i<n;i++){
            String left=s.substring(0,i+1);
            String right=s.substring(i+1,n);

            int countTotal=countZeros(left)+countOnes(right);
            System.out.println(countTotal);
            answer=Math.max(answer,countTotal);
            }
            return answer;
        }
    }
*/