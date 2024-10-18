class Solution {
    public String convertToTitle(int columnNumber) {
       StringBuilder result=new StringBuilder();
       while(columnNumber>0){
        columnNumber--;
        int rem=columnNumber%26;
        result=result.append((char)(rem+'A'));
        columnNumber=columnNumber/26;
       }
       return result.reverse().toString();
    }
}