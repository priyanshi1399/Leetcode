class Solution {
    public int totalMoney(int n) {
        int count=1;
        int sum=0;
        int i=1;
        int j=i;
        int val=1;
        while(count<=n){
            if(val>7){
                val=1;
                i++;
                j=i;
            }
           System.out.println(j);
            sum+=j;
            j++;
            val++;
            
            count++;
        }
        return sum;
    }
}