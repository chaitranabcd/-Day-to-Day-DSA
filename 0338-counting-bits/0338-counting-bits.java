class Solution {
    public int[] countBits(int n) 
    {
        int [] arr = new int[n + 1];
        for(int i = 0 ; i < n + 1 ; i++)
        {
            int cnt = 0;
            cnt += arr[i>>1] + (i&1);
            arr[i] = cnt;
            cnt = 0;
        }
        return arr;
        
    }
}