public class Solution {
    public string ConvertDateToBinary(string date) {
        var parts=date.Split('-');
        var num=$"{ToBinary(parts[0])}-{ToBinary(parts[1])}-{ToBinary(parts[2])}"; //interpolaton string,allows to embeded expressionwithin string literals, without using string.format method
        return num;
    }

    private string ToBinary(string parts){
        string str="";
        var n=Convert.ToInt32(parts);
        while(n!=0){
            str=(n%2).ToString()+str;
            n/=2;
        }
        return str;
    }

}