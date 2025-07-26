class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int count=1;
        int idx=0;
        for(int i=0;i<n;i++){
            if(i+1<n && chars[i]==chars[i+1]){
                count++;
            }
            else{
                if(count>1){
                chars[idx++]=chars[i];
                for(char c:String.valueOf(count).toCharArray()){
                    chars[idx++]=c;
                }
                count=1;
                }
                else{
                   chars[idx++]=chars[i];
                }
            }
        }
       

        return chars.length-(chars.length-idx);
    }
}