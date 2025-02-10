class Solution {
    public String clearDigits(String s) {
        boolean b=true;

        while(b){
            if(s==""){
                return s;
            }
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                b=true;
                s=s.replace(s.substring(i-1,i+1),"");
                break;
            }
            else{
                b=false;
            }
        }
        }
        return s;
    }
}