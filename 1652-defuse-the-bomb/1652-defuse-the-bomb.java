class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int [] res=new int[n];
        if(k==0){
            return res;
        }
        int left=(k>0)?1:n+k;
        int right=(k>0)?k:n-1;
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=code[i%n];
        }
        /* 5 7
         1 4 k=-2 n=4
        left =2 right=3
        sum=1+4=5
         i=0
         res[0]=5
         sum=5-code[(2+0)%4]  sum=5-1=4
        sum=4+code[(3+0+1)%4] sum=4+5=9
        i=1          
        res[1]=9
        
        */
        for(int i=0;i<n;i++){
            res[i]=sum;
            sum-=code[(left+i)%n];
            sum+=code[(right+i+1)%n];
        }
        return res;

        /*
        int n=code.length;
        int [] arr=new int[n];
        int sum=0;
        if(k>0){
            for(int i=0;i<n;i++){
                int k1=k;
                int j=i+1;
            sum=0;
           while(k1>0){
                    if(j==n){
                        j=0;                     
                    }
                    else{
                    sum=sum+code[j];
                    j++;
                    k1--;
                    }
                }
                arr[i]=sum;
            }
        }
        
        else if(k==0){
            for(int i=0;i<n;i++){
                arr[i]=0;
            }
        }
        else{
            for(int i=0;i<n;i++){
                int k1=(-1)*k;
                sum=0;
               int j=i-1;
                while(k1>0){
                    if(j==-1){
                        j=n-1;
                    }
                    else{
                  sum=sum+code[j];
                  j--;
                  k1--;  
                }
                }
                arr[i]=sum;
            }
        }
        return arr;


        */
    }
}