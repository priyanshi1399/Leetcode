class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n=nums.length;

        int [] res=new int[n];
        Stack<Integer> stck=new Stack<>();
        for(int i=2*n-1;i>=0;i--){

            while(!stck.isEmpty() && stck.peek()<=nums[i%n]){
                stck.pop();
            }
            if(i<n){
            res[i]=stck.isEmpty()?-1:stck.peek();
            }

            
        stck.push(nums[i%n]);

        } 

       return res;


       /* int n=nums.length;
        int [] temp =new int[2*n];
        int t=temp.length;
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
            temp[n+i]=nums[i];
        }
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        int [] res=new int[2*n];
        Stack<Integer> stck=new Stack<>();
        for(int i=t-1;i>=0;i--){

            while(!stck.isEmpty() && stck.peek()<=temp[i]){
                stck.pop();
            }

            if(stck.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=stck.peek();
            }
        stck.push(temp[i]);

        } 

        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=res[i];
        }
        return ans;*/


        /*int n=nums.length;
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
            for(int j=1;j<n;j++){
                if(nums[(i+j)%n]>nums[i]){
                    res[i]=nums[(i+j)%n];
                    break;
                }
            }
        }
        return res;*/
    /*
     1 2 1
    i=0 j=1
    res[0]=2
    i=1 j=1 
    res[1]=-1
    i=2 j=1
    i=2 j=2
    res[2]=2;
    */

       /* int [] temp=new int [2*n]; // 1 2 1 1 2 1
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
            temp[n+i]=nums[i];
        }
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<temp.length;j++){
                if(temp[j]>temp[i]){
                    res[i]=temp[j];
                    break;
                }
                res[i]=-1;        
            }
        }
        return res;*/
    }
}