class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int peak=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                peak++;
            }
            if(peak>1){
                return false;
            }
        }
    return true;

    }
}

    /*public boolean check(int[] nums) {
        int n=nums.length;
        int [] sorted=new int[n];
        for(int i=0;i<n;i++){
            sorted[i]=nums[i];
        }
        Arrays.sort(sorted);
        for(int r=0;r<n;r++){
            boolean isSorted=true;
            for(int i=0;i<n;i++){
                if(sorted[i]!=nums[(i+r)%n]){
                    isSorted=false;
                    break;
                }
            }
            if(isSorted==true){
                return true;
            }
        }
        return false;
    }
    }*/
   /* public boolean check(int[] nums) {
        boolean b=false;
        int n=nums.length;
        int [] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=nums[i];
        }
        Arrays.sort(A);
        int val=0;
        for(int i=0;i<n;i++){
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

}*/