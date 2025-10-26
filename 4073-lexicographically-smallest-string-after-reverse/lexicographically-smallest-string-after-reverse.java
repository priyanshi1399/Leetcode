class Solution {
    public String lexSmallest(String s) {
        int n=s.length();
        String ans=s;
        for(int i=0;i<n;i++){
            String firstPart=s.substring(0,i);
            firstPart=rev(firstPart);
            String secondPart=s.substring(i);
            String result=firstPart+secondPart;
            if(ans.compareTo(result)>0){
                ans=result;
            }
        }

          for(int i=n-1;i>=0;i--){
            String firstPart=s.substring(i);
            firstPart=rev(firstPart);
            String secondPart=s.substring(0,i);
            String result=secondPart+firstPart;
            if(ans.compareTo(result)>0){
                ans=result;
            }
        }
        return ans;
    }

    public String rev(String s){
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        return str.toString();
    }
}