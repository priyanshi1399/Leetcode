class Solution {
    public String largestNumber(int[] nums) {
        String [] arr=new String[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=String.valueOf(nums[i]); //["3","30","34","5","9"]
        }

        Arrays.sort(arr,(a,b)-> (b+a).compareTo(a+b));
        if(arr[0].equals("0")){
            return "0";
        }

        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
        }
        return str.toString();

    }
}

/*
"93" and "39"
"930" and "390"
"934" and "349"
"95" and "59"

9 5 34 3 30

"303" and "330"
"334" and "343"
"3034" and "3430"


*/