class BrowserHistory {
    Stack<String> stck1;
    Stack<String> stck2;
    String ans;

    public BrowserHistory(String homepage) {
        ans=homepage;
        stck1=new Stack<>();
        stck2=new Stack<>();

    }
    
    public void visit(String url) {
        stck1.push(ans);
        ans=url;
        stck2.clear();
    }
    
    public String back(int steps) {

        while(!stck1.isEmpty() && steps>0){
            stck2.push(ans); 
            ans=stck1.pop();
            steps--;
        }
        return ans;

        }
    
    public String forward(int steps) {
       
        
         while(!stck2.isEmpty() && steps>0){
            stck1.push(ans);
            ans=stck2.pop();
            steps--;
        }
       
        return ans;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */