class Solution {
    public int minimumSum(int num) {
     /*   int [] res=new int[4];
        int total=0;
        int sum=0;
        int i=0;
        while(num!=0){
            int digit=num%10;
            res[i]=digit;
            i++;
            num=num/10;
        }
        Arrays.sort(res);
        String s1=Integer.toString(res[0])+Integer.toString(res[2]); //23
        String s2=Integer.toString(res[1])+Integer.toString(res[3]);    //29       
        total=Integer.parseInt(s1)+Integer.parseInt(s2);             
        return total; */



        int [] res=new int[4];
        int total=0;
        int sum=0;
        int i=0;
        while(num!=0){
            int digit=num%10;
            res[i]=digit;
            i++;
            num=num/10;
        }
        Arrays.sort(res);
        int num1=res[0]*10+res[2];
        int num2=res[1]*10+res[3];  
        total=num1+num2 ;          
        return total; 
    }
}
