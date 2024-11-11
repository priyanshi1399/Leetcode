class Solution {
    public int longestMountain(int[] arr) {
        
       /* int maxlength=0;
        int n=arr.length;
        int left=0;
        int right=0;
        int index=1;
        while(index<n){
            while(index<n && arr[index-1]==arr[index]){
                ++index;
            }
            left=0;
            while(index<n && arr[index-1]<arr[index]){
                ++left;
                ++index;
            }
            right=0;
            while(index<n && arr[index-1]>arr[index]){
                ++right;
                ++index;
            }
            if(left>0 && right>0){
                maxlength=Math.max(maxlength,left+right+1);
            }
        }
        return maxlength;*/
        
        int n=arr.length;
        if(n<3){
            return 0;
        }
        int maxLength=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int left=i;
                int right=i;
                while(left>0 && arr[left-1]<arr[left]){
                    left--;
                }
                while(right<n-1 && arr[right+1]<arr[right]){
                    right++;
                }
                int diff=right-left+1;
                maxLength=Math.max(maxLength,diff);

            }
        }
        return maxLength;

        /*int n=arr.length;
        int i=0;
        int count=0;
        if(n<3){
            return 0;
        }
        for(;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
            if(arr[i]>arr[i+1]){
                count++;
                break; //peak condition
            }
        }
        if(i==0 || i==n-1){
            count=0;
        }

        for(;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        return count;

        /*int n=arr.length;
        int left=0;
        int right=n-1;
        int count=0;
        if(n<3){
            return 0;
        }
        while(left<right){
            if(arr[left]<arr[left+1]){
                count++;
                left++;
            }
            else{
                left++;
                count=0;
            }
            if(arr[right]<arr[right-1]){
                count++;
                right--;
            }
            else{
                right--;
                count=0;
            }
            
        }
        if(count==0){
            return 0;
        }
        return count+1;*/
        
    }
}