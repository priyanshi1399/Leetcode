class Solution {
    public long removeZeros(long n) {
        String number=String.valueOf(n);
        String newString="";
        for(int i=0;i<number.length();i++){
        if(number.charAt(i)=='0'){
            continue;
        }
        else{
            newString+=number.charAt(i);
        }
        }
        return Long.parseLong(newString);
    }
}