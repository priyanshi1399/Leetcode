class Solution {
    public int maximum69Number (int num) {
        int index=-1;
        String number=Integer.toString(num);
        StringBuilder builder=new  StringBuilder(number);
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)!='9'){
                index=i;
                builder.setCharAt(index,'9');
                break;
            }
        }
        if(index!=-1){
            return Integer.parseInt(builder.toString());
        }
        return num;
    }
}