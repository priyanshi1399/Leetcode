class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int count;
        int idx=0;
        int i=0;
        while(i<n){
            char curr_char=chars[i];
            count=0;
            while(i<n && chars[i]==curr_char){
                count++;
                i++;
            }
             chars[idx]=curr_char;
             idx++;
                if(count>1){
                String count_Val=String.valueOf(count);
                for(int j=0;j<count_Val.length();j++){
                    chars[idx]=count_Val.charAt(j);
                    idx++;
                }
               
            }
        }
       

        return idx;
    }
}