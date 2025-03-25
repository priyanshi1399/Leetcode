class Bank {
    private long [] balance;
    int n;
   
    public Bank(long[] balance) {
        this.n=balance.length;
        this.balance=balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if((account1-1>=0 && account1-1<=n) && (account2-1>=0 && account2-1<=n)){
            System.out.println(balance[account1-1]);
            if(balance[account1-1]>=money){
                
                balance[account2-1]+=money;
                balance[account1-1]-=money;
                if(balance[account1-1]>=0 && balance[account2-1]>=0){
                return true;
                }
            }
        }
        return false;

    }
    
    public boolean deposit(int account, long money) {
        if(account-1>=0 && account-1<=n && money>=0){
            balance[account-1]+=money;
            return true;
        }
        return false;
    }
    
    public boolean withdraw(int account, long money) {
        if(account-1>=0 && account-1<=n){
            if(balance[account-1]>=money){
                balance[account-1]-=money;
            if(balance[account-1]>=0){
                return true;
            }
        }
    }
    return false;
}
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */