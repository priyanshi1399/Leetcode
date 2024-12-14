class Solution {
    public int[] decrypt(int[] code, int k) {
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
    }
}