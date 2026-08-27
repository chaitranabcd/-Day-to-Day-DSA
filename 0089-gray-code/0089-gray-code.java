class Solution {
    public List<Integer> grayCode(int n) {

        List<Integer> ls = new ArrayList<>();
        int m = (int)Math.pow(2,n);
        int [] arr = new int[m];

        for(int i = 0 ; i < m ; i++)
        {
            arr[i] = i ^ (i>>1);
        }

        for(int i = 0 ; i < m ; i++)
        {
            ls.add(arr[i]);
        }
        return ls;
    }
}