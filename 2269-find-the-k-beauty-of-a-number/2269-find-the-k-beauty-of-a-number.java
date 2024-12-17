class Solution {

    private int checkKBeauty(String subPart,int num){
        int part=Integer.parseInt(subPart);
        int c=0;
        if(part==0){
            return 0;
        }
        if(num%part==0){
            c=1;
        }
        return c;
        
    }

    public int divisorSubstrings(int num, int k) {
        int i=0;
        String num1=Integer.toString(num);
        int count=0;
        while(i<=num1.length()-k){
           count+= checkKBeauty(num1.substring(i,i+k),num);
           i++;
        }
        return count;
    }

}