class Solution {
    public String countAndSay(int n) {
        String res="1";
        int count=1;
        for(int i=1;i<n;i++){
            count=1;
            StringBuilder str=new StringBuilder();
            for(int j=1;j<res.length();j++){
                if(res.charAt(j)==res.charAt(j-1)){
                    count++;
                }
                else{
                    str.append(count).append(res.charAt(j-1)); //adding into the stringbUilder when not equal
                    count=1;
                }
            }
            str.append(count).append(res.charAt(res.length()-1));
            res=str.toString();
           // System.out.println(res);
        }
        return res.toString();
    }
}