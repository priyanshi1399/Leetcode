class Solution {

    public String shiftingLetters(String s, int[] shifts) {
        int n=shifts.length;
        int [] prefixArray=new int[n];
        prefixArray[n-1]=shifts[n-1]%26;
        for(int i=n-2;i>=0;i--){
            prefixArray[i]=(prefixArray[i+1]+shifts[i])%26;
        }

        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=(char)('a'+(s.charAt(i)-'a'+prefixArray[i])%26);
            str.append(ch);
        }
        return str.toString();
    }
}

   /* public String replaceCharacter(String str,int shift){
        char [] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            ch[i]=(char)('a'+(ch[i]-'a'+shift)%26);
        }
        return new String(ch);
    }

    public String shiftingLetters(String s, int[] shifts) {
        String str1=s;
        for(int i=0;i<s.length();i++){
            s=str1;
            String newStr=replaceCharacter(s.substring(0,i+1),shifts[i]);

            str1=newStr+s.substring(i+1,s.length());

        }
        return str1;
    }
}*/