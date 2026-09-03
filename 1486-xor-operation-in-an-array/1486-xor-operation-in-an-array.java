class Solution {
    public int xorOperation(int n, int start) {
        int [] arr = new int[n];

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = start;
            start +=2;
        }
        int res = 0;
        for(int  i = 0 ; i < n ; i++)
        {
            res ^= arr[i];
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(res);
        return res;
    }
}