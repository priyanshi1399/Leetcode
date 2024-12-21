class Solution {
    public void swap(char [] arr, int i ,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public int nextGreaterElement(int n) {
        String s=Integer.toString(n);
        char [] nums=s.toCharArray(); //making it to character array
        int len=nums.length;
        int i= len-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i==-1){ //only greater we havent find the smallest element no breaking condition
            return -1;
        }

        int k=len-1; //at the last
        while(nums[k]<=nums[i]){ //where we found greater will swap
            k--;
        }

        swap(nums,i,k);
        Arrays.sort(nums,i+1,len);

        long ans=Long.valueOf(new String(nums));
        if(ans>Integer.MAX_VALUE){
            return -1;
        }
        return (int)ans;

    }
}