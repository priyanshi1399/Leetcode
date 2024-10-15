class Solution {

    public int countSetBit(int num){
        int count=0;
        while(num>0){
            int digit=num%2;
            if(digit==1){
                count++;
            }
            num=num/2;
        }
        //System.out.println("set bit is"+count);
        return count;
        
    }


    public int countPrime(int n){
        int count1=1; 
        if(n<2){
            count1=0;
        }
        else if(n==2){
            count1=1;
        }
       for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            count1=0;
        }      
       }
       //System.out.println(count1);
       return count1;

    }


    public int countPrimeSetBits(int left, int right) {
        int count2=0;
            for(int i=left;i<=right;i++){
                int k=countSetBit(i);
                count2=count2+countPrime(k);
            }
        return count2; 
    }

}