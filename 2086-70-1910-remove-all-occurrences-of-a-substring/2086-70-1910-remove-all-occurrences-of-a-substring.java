class Solution {
     public String removeOccurrences(String s, String part) {
        String result="";
        for(int i=0;i<s.length();i++){
            result=result+s.charAt(i);
            if(result.length()>=part.length()){
                if(result.substring(result.length()-part.length(),result.length()).equals(part)){
                    result=result.replace(result.substring(result.length()-part.length(),result.length()),"");
                }
            }
        }
        return result;

     }
}
    /*public String removeOccurrences(String s, String part) {
           
        while(true){
            int index=-1;
            index=s.indexOf(part);
            if(index==-1){
                break;
            }

            s=s.substring(0,index)+s.substring(index+part.length() ,s.length());
        }
        return s;
    
}
}*/