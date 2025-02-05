class Solution {
    
    public String swap(int idx1,int idx2,String s){
        char [] charArray=s.toCharArray();
        char temp=charArray[idx1];
        charArray[idx1]=charArray[idx2];
        charArray[idx2]=temp;
        String newString=new String(charArray);
        return newString;
    }
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        int index1=-1;
        int index2=-1;
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2){
                if(index1==-1){
                    index1=i;
                }
                else if(index2==-1){
                    index2=i;
                    break;
                }
            }
        }
        if(index1!=-1 && index2!=-1){
        String newString =swap(index1,index2,s1);
        if(!newString.equals(s2)){
            return false;
        }
        }
        else if(index1!=-1 && index2==-1 || index1==-1 && index2!=-1){
            return false;
        }

        return true;
    }
}