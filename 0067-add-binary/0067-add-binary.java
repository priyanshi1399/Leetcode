class Solution {
    public String addBinary(String a, String b) {
        int alen=a.length();
        int blen=b.length();
        String ans="";
        int i=0;
        int carry=0;

        while(i<alen || i<blen || carry!=0) //continue untill if any element is left in a or b and even carry also 1
        {
            int x=0;
            if((i<alen) && (a.charAt(alen-i-1)=='1')) //check for 1 if 1 then count 1otherwise 0 and starting at last element 
            {
                x=1;
            }
            int y=0;
            if((i<blen) && (b.charAt(blen-i-1)=='1'))
            {
                y=1;
            }
            ans=Integer.toString((x+y+carry)%2)+ans; //appending before every bit
            carry=(x+y+carry)/2;
            i+=1; //increasing every time

        }
        return ans;
    }
}