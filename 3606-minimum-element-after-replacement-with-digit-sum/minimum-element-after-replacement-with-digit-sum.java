class Solution {
    int minVal=100001;
    public int digitSum(int n){
        return (n/10000)
        +(n%10000/1000)
        +(n%1000/100)
        +(n%100/10)+n%10;
    }
    public int minElement(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
        int n=nums[i];
        int singleNum=digitSum(n);
        minVal=Math.min(minVal,singleNum);
        }
        return minVal;
    }
    
}

/*
1. Goal → Find minimum digit sum among all elements in nums[]
2. nums[i] ≤ 10^4 → max 5 digits → max digit sum = 9+9+9+9 = 36
3. Initialize result = 37 → acts as safe infinity (any real sum ≤ 36)
4. digitSum() extracts each digit using / and % — no loops, no strings
5. digitSum() is O(1) → fixed 5 arithmetic operations always
6. Main loop runs once over array → overall O(n) time
7. Only 2 variables used (result, s) → O(1) space
8. Math.min() tracks rolling minimum — updates only when smaller sum found
9. No sorting, no string conversion → pure arithmetic approach
10. Works because input is bounded (≤ 10^4) — boundedness enables O(1) digit extraction
*/