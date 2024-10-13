public class Solution {
    public void Rotate(int[][] matrix) {
        int temp=0;
        for (int i = 0; i < matrix.Length - 1; i++)
{
    for (int j = i + 1; j < matrix[i].Length; j++)
    {
         temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
for(int i = 0;i < matrix.Length; i++)
{
    Array.Reverse(matrix[i]);
}
    }
}