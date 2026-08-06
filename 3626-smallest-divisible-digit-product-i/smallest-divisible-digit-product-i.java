class Solution {
     boolean flag=false;
    public int callValidProduct(int num,int t,int n){
        while(num%t!=0){
            if(n>=10 && n<=99){
                System.out.println("yesAll");
                flag=true;
                return n;
            }
            num++;
            n++;
        }   
        return n;
    }
    
    public int smallestNumber(int n, int t) {
        int product=0;
        int ans=0;
        if(n<10){
            product=n;
            return callValidProduct(product,t,n);
        }
        else if(n>=10 && n<=99 ){
            System.out.println("yes");
                int first=n/10;
                int second=n%10;
                product=first*second;
                ans=callValidProduct(product,t,n);
                while(flag==true){
                n++;
                System.out.println("no");
                flag=false;
                 first=n/10;
                 second=n%10;
                product=first*second;
                ans=callValidProduct(product,t,n);
                }
            return ans;
        }
        else if(n==100){
            product=0;
            return callValidProduct(product,t,n);
        }
        return ans;
    }
}