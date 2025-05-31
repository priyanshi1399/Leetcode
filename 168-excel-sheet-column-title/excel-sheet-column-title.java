class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            char s=(char)((rem+'A'));
            str.append(s);
            columnNumber=columnNumber/26;
        }
        return str.reverse().toString();
    }
}