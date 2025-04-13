class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        if(n==1 || n==2){
            return s;
        }

        int m=n/2;
        char [] front =s.substring(0,m).toCharArray();
        Arrays.sort(front);
        String f=new String(front);
        StringBuilder back=new StringBuilder(f).reverse();
        if(n%2==1){
            f+=s.charAt(m);
        }
        return f+back.toString();

    }
}