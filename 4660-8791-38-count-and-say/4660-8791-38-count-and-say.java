class Solution {
    public String countAndSay(int n) {
        String res="1";
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<n;i++){
            for(int j=0;j<res.length();j++){
                int count=1;
                char ch=res.charAt(j);
                while(j<res.length()-1 && res.charAt(j)==res.charAt(j+1)){
                    count++;
                    j++;
                }
            ans.append(Integer.toString(count)+Character.toString(ch));
           // System.out.println(ans.toString());
            }
            res=ans.toString();
            ans.setLength(0);
        }
        return res;
    }
}