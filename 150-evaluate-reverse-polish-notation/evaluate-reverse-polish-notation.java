class Solution {
    public int Add(int A,int B){
        return A+B;
    }
    public int multiply(int A,int B){
        return A*B;
    }
    public int divide(int A,int B){
        if(A!=0){
            return B/A;
        }
        return 0;
    }
    public int subtract(int A,int B){
        return B-A;
    }


    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer> stck=new Stack<>();
        int i=0;
       while(i<n){
            while((i<n) && (!tokens[i].equals("+")) && (!tokens[i].equals("*")) && (!tokens[i].equals("-")) && (!tokens[i].equals("/"))){
                stck.push(Integer.parseInt(tokens[i]));
                i++;
            }
            if(stck.size()>=2){
                int A=stck.pop();
                int B=stck.pop();
                     if(tokens[i].equals("+")){
                    int C=Add(A,B);
                    stck.push(C);
                    }
                    else if(tokens[i].equals("-")){
                        int C=subtract(A,B);
                        stck.push(C);
                    }
                    else if(tokens[i].equals("*")){
                        int C=multiply(A,B);
                        stck.push(C);
                    }
                    else{
                        int C=divide(A,B);
                        stck.push(C);
                    }
                }
                else{
                    break;
                }
                i++;

        }
        if(!stck.isEmpty()){
            return stck.pop();
        }
        return -1;
    }
}