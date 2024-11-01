class Solution {
    public String makeFancyString(String s) {
        int count=1;
         StringBuilder s1=new StringBuilder();
         s1.append(s.charAt(0));
         for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                if(count<=2){
                    s1.append(s.charAt(i));
                }
            }
            else{
                count=1;
                s1.append(s.charAt(i));
            }
            }
         return s1.toString();
   /* StringBuilder s1=new StringBuilder();
    s1.append(s);
        int n=s1.length();
        int count=1;
        int j=0;
        for(int i=1;i<n;i++){
            if(s1.charAt(i)==s1.charAt(i-1)){
                    count++;
                    if(count>2){
                    s1.deleteCharAt(i);
                    n--;
                    i--;
                    }
                }
            else{
                count=1;
            }
        }
        return s1.toString();*/
    }
}