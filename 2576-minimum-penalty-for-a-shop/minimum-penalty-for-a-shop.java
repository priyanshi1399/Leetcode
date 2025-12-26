class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
      int [] arr=new int[n+1];
      int sum=0;
      for(int i=0;i<n;i++){
        char ch=customers.charAt(i);
        if(ch=='N'){
            arr[i]=1;
        }
        sum+=arr[i];
      }
      //System.out.println("sum is :" +sum);
    arr[n]=sum;
    int minValue=sum;
    int earlisetHour=n;
      for(int i=arr.length-2;i>=0;i--){
        if(arr[i]==1){
            sum-=1;
        }
        else{
            sum+=1;
        }
        arr[i]=sum;
        sum=arr[i];
       // System.out.println(arr[i]);
        if(arr[i]<=minValue){
            earlisetHour=i;
              minValue=arr[i];
        }


      
    }
    return earlisetHour;
}
}