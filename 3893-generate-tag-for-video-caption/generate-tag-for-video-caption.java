class Solution {
    public String generateTag(String caption) {
        String [] parts=caption.trim().split(" ");
        StringBuilder str=new StringBuilder("#");
        for(int i=0;i<parts.length;i++){ 
            if (parts[i].equals(" ") || parts[i].equals("")) {
                continue;
            }
            else{
                System.out.println(parts[i]);
                if(i==0){
                    str.append(String.valueOf(parts[i].charAt(0)).toLowerCase());
                }
                else{
                str.append(String.valueOf(parts[i].charAt(0)).toUpperCase());
                }
                int len=parts[i].length();
                String sub=parts[i].substring(1,len).toLowerCase();
                str.append(sub);
            }
        }

       
        if(str.length()<100){
            return str.toString();
        }
        return str.toString().substring(0,100);
    }
}