class Solution {
    
    public boolean check(int[] nums) {
        boolean b=false;
        int n=nums.length;
        int [] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=nums[i];
        }
        Arrays.sort(A);
        int val=0;
        for(int i=0;i<n;i++){
            b=false;
            val=A[0];
        for(int j=1;j<n;j++){
            A[j-1]=A[j];
        }
        A[n-1]=val;
        for(int x=0;x<n;x++){
            System.out.println(A[x]);
        }
       for(int k=0;k<n;k++){
        if( nums[k]==A[k]){
            b=true;
        }
        else{
            b=false;
            break;
        }
       }
       if(b==true){
        return b;
       }
       
    }
    return b;
    }

}