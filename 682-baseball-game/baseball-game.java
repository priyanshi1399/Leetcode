class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> stck=new Stack<>();
        int n=op.length;
        for(int i=0;i<n;i++){
            if(stck.size()>=2 && op[i].equals("+")){
                int B=stck.pop();
                int A=stck.pop();
                stck.push(A);
                stck.push(B);
                stck.push(B+A);
            }
            else if(op[i].equals("D")){
                stck.push(stck.peek()*2);
            }
            else if(op[i].equals("C")){
                stck.pop();
            }
            else{
                stck.push(Integer.parseInt(op[i]));
            }

            
        }
        int sum=0;
        while(!stck.isEmpty()){
            sum+=stck.pop();
        }
        return sum;
    }
}