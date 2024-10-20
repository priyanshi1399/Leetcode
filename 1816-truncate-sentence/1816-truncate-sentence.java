class Solution {
    public String truncateSentence(String s, int k) {
       /* String [] ch=s.split(" ");
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<k;i++){
            s1.append(ch[i]);
            if(i<k-1){
                s1.append(" ");
            }           
        }
        return s1.toString();*/
    
       int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
                if(count==k){
                    return s.substring(0,i);
                }
            }
        }
        return s;
    
    }
}
//T(C)-->0(no of characters in String)=>0(s.length)
//SC: 0(noof characters)
