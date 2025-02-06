class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        int index1=0;
        int index2=0;
        int diff=0;
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2){
                diff++;
                if(diff>2){
                    return false;

                }
                else if(diff==1){ //found one character diff
                    index1=i;
                }

                else if(diff==2){
                    index2=i;
                }
            }
        }
        System.out.println(index1);
        System.out.println(index2);
        char [] charArray1=s1.toCharArray();
        char [] charArray2=s2.toCharArray();

        return charArray1[index2]==charArray2[index1] && charArray1[index1]==charArray2[index2];
    }
}
    /*public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int [] freq1=new int[26];
        int [] freq2=new int[26];

        int inequalityCount=0;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                inequalityCount++;
            }

            if(inequalityCount>2){
                return false;
            }
        }
        
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
        if(freq1[i]!=freq2[i]){
            return false;
        }
        }
        return true;

    }
}
*/
    /*public String swap(int idx1,int idx2,String s){
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
}*/