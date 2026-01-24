class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int idx=0;
        while(i<n){
            char curr_char=chars[i];
            int count=0;
            while(i<n && chars[i]==curr_char){
                count++;
                i++;
            }
            chars[idx]=curr_char;
            idx++;
            if(count>1){
            String count_Val=String.valueOf(count); //12 length=2
            for(int j=0;j<count_Val.length();j++){
                chars[idx]=count_Val.charAt(j);
                idx++;
            }
            }
    }
    return idx;
}
}