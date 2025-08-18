class Solution {
    HashMap<Character,String> lettersMap=new HashMap<>();
    public void solve(int index,String digits,StringBuilder curr,List<String> res){
        if(index>=digits.length()){
            res.add(curr.toString());
            return;
        }


        if(lettersMap.containsKey(digits.charAt(index))){
            String str=lettersMap.get(digits.charAt(index));
            for(int i=0;i<str.length();i++){
                curr.append(str.charAt(i));
                solve(index+1,digits,curr,res);
                curr.deleteCharAt(curr.length()-1);
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        lettersMap.put('2',"abc");
        lettersMap.put('3',"def");
        lettersMap.put('4',"ghi");
        lettersMap.put('5',"jkl");
        lettersMap.put('6',"mno");
        lettersMap.put('7',"pqrs");
        lettersMap.put('8',"tuv");
        lettersMap.put('9',"wxyz");
        List<String> res=new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        if(digits.equals("")){
            return res;
        }
        solve(0,digits,curr,res);
        return res;
    }
}