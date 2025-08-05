class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder ans=new StringBuilder(); //take String for result
        int n=num.length();
        if(n==k) return "0"; //if length and k is same return "0"
        for(int i=0;i<n;i++){
            while(ans.length()>0 && ans.charAt(ans.length()-1)>num.charAt(i) && k>0){
                ans.deleteCharAt(ans.length()-1); //remove number from last ->"14" and "3" is to come remove 4
                k--; //decrease k value
            }

            if(ans.length()>0 || num.charAt(i)!='0'){
                ans.append(num.charAt(i)); // number starts with 0 then ignore else put 
            }
        }

        while(ans.length()>0 && k>0){
            ans.deleteCharAt(ans.length()-1); // if numbers are in increasing order remove from last
            k--;
        }

        return ans.length()>0 ?ans.toString() :"0"; //if empty return "0"
    }

}