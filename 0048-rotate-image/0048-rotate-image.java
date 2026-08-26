class Solution {
    public void rotate(int[][] arr) 
    {
        int n = arr.length;
        int m = arr[0].length;
        int [][]tran = new int[m][n];

        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                tran[i][j] = arr[j][i];
            }
        } 
        int [][] rotate90 = new int[m][n];
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                rotate90[i][j] = tran[i][n-j-1];
            }
        }  
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                arr[i][j] = rotate90[i][j];
            }
        } 
    }
}