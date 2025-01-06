class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int [] diff=new int[n];

        for(int i=0;i<shifts.length;i++){
            int l=shifts[i][0];
            int r=shifts[i][1];

            if(shifts[i][2]==0){
                diff[l]+=-1;
                if(r+1<n){
                diff[r+1]-=-1;
                }
            }
            else{
                diff[l]+=1;
                if(r+1<n){
                diff[r+1]-=1;
                }
            }
        }
        
        //Calculating cumulative sum
        for(int i=1;i<n;i++){
            diff[i]=diff[i]+diff[i-1];
        }
         for(int i=0;i<n;i++){
            System.out.println(diff[i]);
        }

    char [] ch=s.toCharArray();
    
    for(int i=0;i<n;i++){
        int shift=diff[i]%26;
        if(diff[i]<0){
            ch[i]=(char)('a'+(ch[i]-'a'+shift+26)%26);
        }
        else{
        ch[i]=(char)('a'+(ch[i]-'a'+shift)%26);
        }
    }
    


    return new String(ch);



    }
}