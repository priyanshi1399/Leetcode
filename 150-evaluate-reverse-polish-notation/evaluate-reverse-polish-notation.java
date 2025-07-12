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
        for(String token:tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                    int A=stck.pop();
                    int B=stck.pop();
                    int C=0;
                    if(token.equals("+")){
                         C=Add(A,B);
                    }
                    else if(token.equals("-")){
                        C=subtract(A,B);
                    }
                    else if(token.equals("*")){
                        C=multiply(A,B);
                    }
                    else{
                         C=divide(A,B);
                    }
                    stck.push(C);
            }
            else{
                stck.push(Integer.valueOf(token));
            }
        }
        if(!stck.isEmpty()){
            return stck.pop();
        }
        return -1;
    }
}