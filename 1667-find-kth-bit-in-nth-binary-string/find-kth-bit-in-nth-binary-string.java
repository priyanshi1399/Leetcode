class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder str=new StringBuilder();
        str.append("0");
        for(int i=1;i<=n;i++){
            StringBuilder prevStr=new StringBuilder(str);
            for(int j=0;j<prevStr.length();j++){
                char ch=prevStr.charAt(j);
                if(ch=='0'){
                    prevStr.setCharAt(j,'1');
                }
                else{
                   prevStr.setCharAt(j,'0');
                }
            }
            // System.out.println("string is"+str.toString());
          str=str.append("1").append(prevStr.reverse());
          //System.out.println(str.toString());
        }

     
            return str.charAt(k-1);
        
    }
}