class Solution {
    public int maxTurbulenceSize(int[] arr) {
        char prev=0;
        int result=1;
        int start=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i] && prev!='<'){
                prev='<';
                result=Math.max(result,i-start+1);
            }
            else if(arr[i-1]>arr[i] && prev!='>'){
                prev='>';
                result=Math.max(result,i-start+1);
            }
            else{
                prev=0;
                i-=arr[i-1]==arr[i]?0:1;
                start=i;
            }
            
        
        }
        return result;
    }
}