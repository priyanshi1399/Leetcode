class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stck=new Stack<>();
        int n=operations.length;
        for(int i=0;i<n;i++){
            if(operations[i].equals("C")){
                stck.pop();
            }
            else if(operations[i].equals("D")){
                stck.push(2*stck.peek());
            }
            else if(operations[i].equals("+")){
                int first=stck.pop();
                int second=stck.pop();
                stck.push(second); //we popped this in second  time so we will push first
                stck.push(first); //we popped first then we will put above second in stck
                stck.push(first+second); //above that need to push this sum of 2 previous sum
            }
            else{
                stck.push(Integer.parseInt(operations[i]));
            }
        }

        int sum=0;
        while(!stck.isEmpty()){
            sum=sum+stck.pop();
        }
        return sum;


      /*  int n=operations.length;
        int j=0;
        int result[]=new int[n];
        for(int i=0;i<n;i++){        
            if(operations[i].equals("C")){
                result[j-1]=0;
                j--;
            }
            else if(operations[i].equals("D")){
                result[j]=2*result[j-1];
                j++;
            }
            else if(operations[i].equals("+")){
                result[j]=result[j-1]+result[j-2];
                j++;
            }
            else{
                result[j]=Integer.parseInt(operations[i]);
                j++;
                
            }
        }
        int sum=0;
        for(int i=0;i<result.length;i++){
            sum+=result[i];
        }
        return sum;*/
    }
}