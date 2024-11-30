class Solution {
    public boolean isPowerOfTwo(int n) { 
        System.out.println(n);
        if(n==0){
            return false; // because stack overflow for 0 so directly return false
        }
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        else{
            return isPowerOfTwo(n/2);
        }
        /*if(n==0){
            return false;
        } 
        if(n==1 || n==2){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);*/

        /*if(n<=0)
            return false;     
       return (n &(n-1))==0; //it will return true
*/



//for 0 need to check because 0 and 0-1
//isPowerofTwo(3)
//8 & 7=1000 &  0111=0
//4 &3 =100 &011=0
//n & n-1==0--> n is power of Two
//6 & 5=110 & 101
//1______& 01111=0
//n & n-1==0-->n is power of 2


//2nd Method

    /*if(n<=0)
        return false;
    while(n>0){
        if(n==1) //n==3
            return true;
        if(n%2!=0)
            return false;
        n=n/2;
    }
    return false;
    }*/

    //16--8-->4-->2-->1
   // 3-->
}
}