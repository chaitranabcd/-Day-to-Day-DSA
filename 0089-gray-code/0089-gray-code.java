class Solution {
    public List<Integer> grayCode(int n) {
        int m = (int)(Math.pow(2,n));

        int [] arr = new int[m];

        for(int i = 0 ; i < m  ; i++)
        {
            arr[i] = i ^ (i >> 1);
        }
        System.out.println(Arrays.toString(arr));

        List<Integer> ls = new ArrayList<>();

        for(int el : arr)
        {
            ls.add(el);
        }
        return ls;
    }
}