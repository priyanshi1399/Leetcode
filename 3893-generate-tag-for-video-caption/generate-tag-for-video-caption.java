class Solution {
    public String generateTag(String caption) {
        String [] parts=caption.trim().split(" ");
        StringBuilder str=new StringBuilder("#");
        for(int i=0;i<parts.length;i++){ 
            String s=parts[i];
            if (s.equals(" ") ||s.equals("")) {
                continue;
            }
            else{
                if(i==0){
                    str.append(String.valueOf(s.charAt(0)).toLowerCase());
                }
                else{
                str.append(String.valueOf(s.charAt(0)).toUpperCase());
                }
                int len=s.length();
                String sub=s.substring(1,len).toLowerCase();
                str.append(sub);
            }
        }

       
        if(str.length()<100){
            return str.toString();
        }
        return str.toString().substring(0,100);
    }
}