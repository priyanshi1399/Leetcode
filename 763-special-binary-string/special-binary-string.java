class Solution {
    public String makeLargestSpecial(String s) {
        List<String> specials=new ArrayList<>();
        int sum=0;
        int start=0;
        for(int i=0;i<s.length();i++){

            sum+=(s.charAt(i)=='1')?1:-1;
            if(sum==0){
                //calculate the inner String to pass in the recursion
                String inner=s.substring(start+1,i);
               // System.out.println(inner);
                String newProcessed="1"+ makeLargestSpecial(inner)+"0";
                specials.add(newProcessed);

                //update start
                start=i+1;
            }
        }

        Collections.sort(specials,Collections.reverseOrder()); //because larger with "1" will come forward

        StringBuilder result=new StringBuilder();
        for(String str:specials){
           // System.out.println(str);
            result.append(str);
        }

        return result.toString();
    }
}