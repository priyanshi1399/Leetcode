class Solution {
    public String lexSmallest(String s) {
        int n=s.length();
        String ans=s;
        for(int i=0;i<n;i++){
            String firstPart=s.substring(0,i+1);
            String secondPart=s.substring(i+1,n);
            StringBuilder str=new StringBuilder(firstPart);
            String toCheck=str.reverse().toString();
            String result=toCheck+secondPart;
            if(result.compareTo(ans)<0){
                    ans=result;
            }

        }
        StringBuilder str2=new StringBuilder();
        str2.reverse();
        for(int i=n-1;i>=0;i--){
            String firstPart=s.substring(i);//starting index i ending last
            String secondPart=s.substring(0,i);
            StringBuilder str=new StringBuilder(firstPart);
            String toCheck=str.reverse().toString();
            String result=secondPart+toCheck;
            if(result.compareTo(ans)<0){
                    ans=result;
            }

        }
        return ans;
    }
}