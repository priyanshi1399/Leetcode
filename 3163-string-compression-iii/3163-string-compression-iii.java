class Solution {
    public String compressedString(String word) {
        String comp="";
        int count=1;
        int i=0;
        for(;i<word.length()-1;i++){          
            if((word.charAt(i)==word.charAt(i+1)) && count<9){
                count++;
            }
            else{
            comp=comp+Integer.toString(count)+word.charAt(i);
            count=1;
            }
        }
    return comp+Integer.toString(count)+word.charAt(i);
    }
}