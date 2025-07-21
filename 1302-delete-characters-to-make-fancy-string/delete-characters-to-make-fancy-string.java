class Solution {
    public String makeFancyString(String s) {
        int count=1;
        int n=s.length();
        StringBuilder str=new StringBuilder();
        str.append(s.charAt(0)); //appending first charcater
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                if(count<=2){
                    str.append(s.charAt(i)); //it is ok to append befor 3 charcaters
                    
                }
                 
            }
            else{
                count=1; //reset the count;
                str.append(s.charAt(i)); //appending because of valid 
            }
        }
        return str.toString();
    }
}