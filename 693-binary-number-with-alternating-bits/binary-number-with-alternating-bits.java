class Solution {
    public boolean hasAlternatingBits(int n) {
            String binary=Integer.toBinaryString(n);
            //System.out.println(binary);
             char currChar=binary.charAt(0)=='1'?'1':'0';
            for(int i=1;i<binary.length();i++){
                char ch=binary.charAt(i);
                
                if(ch=='0' && currChar!='1'){
                      return false;
                }
                if(ch=='1' && currChar!='0'){
                    return false;
                }
                currChar=ch;
            }
            return true;
        }
    }
