class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        StringBuilder result=new StringBuilder();

       for(int i=0;i<num.length();i++){

        while(result.length()>0 && k>0 && result.charAt(result.length()-1)>num.charAt(i)){
                result.deleteCharAt(result.length()-1); //delete from the last of the String
                k--;
        }
        if(result.length()>0 || num.charAt(i)!='0'){ //either length>0 or num.charAt(i)!=0 because then length also will not be greater than 0 case 0200
            result.append(num.charAt(i)); //to avoid leading zeroes
       }
       }

       //if numbers are in increasing order and k is stil left
       while(k>0 && result.length()>0){
            result.deleteCharAt(result.length()-1);
            k--;
       }
       if(result.length()==0){
        return "0";
       }
       return result.toString();


    }
}