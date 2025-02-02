class Solution {
    public int nextGreaterElement(int n) {
        char [] number=(n+"").toCharArray();
        int i;
        for(i=number.length-1;i>0;i--){
            if(number[i]>number[i-1]){
                break;
            }
        }
        if(i==0){
            return -1;
        }
        int x=number[i-1];
        int index=i;
        int j;
        for(j=i;j<number.length;j++){
            if(number[j]>x && number[j]<=number[index]){
                index=j;
            }
        }

        char temp=number[i-1];
        number[i-1]=number[index];
        number[index]=temp;

        Arrays.sort(number,i,number.length);
        String s=new String(number);
        long val=Long.parseLong(s);
        if(val>Integer.MAX_VALUE){
            return -1;
        }
        else{
            return (int)val;
        }


    }
}

/*
534976
*/