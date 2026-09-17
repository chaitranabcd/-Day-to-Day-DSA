class Solution {
    public int[] sortByBits(int[] arr) {
        
        int n = arr.length;
        int m = 100000;
        for(int i = 0 ; i < n ; i++)
        {
            int originalvalue = arr[i];
            int bitcount = Integer.bitCount(arr[i]);
            arr[i] = originalvalue + (bitcount * m);
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = arr[i]%m;
        }
        return arr;
    }
}