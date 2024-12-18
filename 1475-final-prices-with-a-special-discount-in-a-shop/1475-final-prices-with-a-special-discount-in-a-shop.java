class Solution {
    public int[] finalPrices(int[] prices) {
         Stack<Integer> stck=new Stack<>();
        int n=prices.length;
        int [] ans=new int[n];
        for(int i=n-1;i>=0;i--){

            while(!stck.isEmpty() && stck.peek()>prices[i]){
                stck.pop();
            }

            if(stck.isEmpty()){
                ans[i]=prices[i];
            }

            else{
                ans[i]=prices[i]-stck.peek();
            }

            stck.push(prices[i]);
        }
        return ans; 

        /*Stack<Integer> stck=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=prices.length;
        int [] res=new int[n];
        for(int i=0;i<res.length;i++){
            res[i]=prices[i];
        }
        for(int i=0;i<n;i++){
            while(!stck.isEmpty() && prices[i]<=prices[stck.peek()]){
                res[stck.peek()]=prices[stck.peek()]-prices[i];
                        stck.pop();
            }

            stck.push(i);
        }

       return res; */
       
        /*int n=prices.length;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=prices[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(j>i && prices[j]<=prices[i]){
                    ans[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return ans;*/
    }
}