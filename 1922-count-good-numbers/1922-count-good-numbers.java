class Solution {
    /*_ 0,2,4,6,8 -5C1 --5^n *4^1 =5*4 =>5^1/2 * 4^1/2

    _ _ 5C1*4C1=5*4=20 --5^n *4^n =25*16 =400= 20*20 =>5^n/2 *4^n/2

    _ _ _ 5C1*4C1*5C1=5*4*5=100 --5^n*4^n*5^n=5^(n+1)*4^n =5^4*4^3=625*64=40000 --5^n/2 *4^n/2 *5^n/2 =>5^(n/2+1)*4^(n/2)

    _ _ _ _5C1*4C1*5C1*4C1=5*4*5*4=400 --5^(n+1)*4^(n+1) --5^n/2 *4^n/2 *5^n/2 *4^n/2= =>5^(n/2+1) *4^(n/2+1)

*/

int mod=(int)1e9+7;
  public int countGoodNumbers(long n) {
    long first=(n%2==0?(n/2):((n/2)+1));
    long second=n/2;

    long multi1=Power(5,first)%mod;
    long multi2=Power(4,second)%mod;

    long ans=1;
    ans=(ans*multi1)%mod;
    ans=(second!=0)?(ans*multi2)%mod:ans;
    return (int)(ans%mod);

  }

  public long Power(long x,long y){

    long temp;
    if(y==0){
        return 1;
    }
    temp=Power(x,y/2);
    if(y%2==0){
        return (temp*temp)%mod;
    }
    else{
        return (x*temp*temp)%mod; //for odd length we multiply 5 one more time
    }
  }
}
   /* int mod=(int)(Math.pow(10,9)+7);
    public int countGoodNumbers(long n) {
        if(n==1){
            return 5;
        }
        if(n%2==0){
            return Power(20,n/2);
        }
        return (int)Multi(Power(20,n/2),5);
        
    }

    public int Power(int a, long n){
        if(n==0){
            return 1;
        }
        long partialAnswer=Power(a,n/2);
        partialAnswer=Multi(partialAnswer,partialAnswer);
        if(n%2==0){
            return (int)(partialAnswer);
        }
        return (int)Multi(partialAnswer,a);
    }

    public int Multi(long a,long b){
        return (int)(((a%mod)*(b%mod))%mod);*/
 //   }
//}

/* n=5
_ _ _ _ _ 
5 4 5 4 5
5*4*5*4*5
5*5*5*4*4*
5 to the power of(3) =>n+1/2
4 to the power of(2)=> n/2
power(5,3)-->recusrion
power(4,2)-->recursion
power(n,x)--> 5 to the power of (7)
x is odd 
pow(n,x/2)*pow(n,x/2)*n =>5*5*5
x is even --> 5 to the power(6)
pow(n,x/2)*pow(n,x/2)

n=4
5 4 5 4   power(5,2)
5*5*4*4         power(4,2)
_ _ _ _
*/
/*pow(5,2) =pow(n,x/2)*pow(n,x/2)
pow(4,2)=pow(n,x/2)*pow(n,x/2)*/