class Solution {

    private int customBinarySearch(int [] arr,int target){
        int n=arr.length;
        int l=0;
        int r=n-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int j=customBinarySearch(arr,2*arr[i]);      
            if(j!=-1 && j!=i){
                return true;
            }     
        }
        return false;



       /* HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]*2)){
                return true;
            }
            else if(arr[i]%2==0 && map.containsKey(arr[i]/2)){
                return true;
            }
            else{
            map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + ":"+ entry.getValue());
        }
        return false;*/

       /* int n=arr.length;
        int i=0;
        while(i<n){
        for(int j=0;j<n;j++){
            if(i!=j && arr[i]==2*arr[j]){
                return true;
            }
        }
        i++;
        }
        return false;*/

       /* int n=arr.length;
        for(int i=0;i<n;i++){
            int j=0;
            while(j<n){
                if((arr[i]==2*arr[j]) && (i!=j)){
                    return true;
                }
                else{
                    j++;
                }
            }
        }
        return false;*/
    }
}