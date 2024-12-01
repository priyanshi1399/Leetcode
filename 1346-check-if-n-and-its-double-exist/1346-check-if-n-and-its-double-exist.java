class Solution {
    public boolean checkIfExist(int[] arr) {

        HashMap<Integer,Integer> map=new HashMap<>();
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
        return false;

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