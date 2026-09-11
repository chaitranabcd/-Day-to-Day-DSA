class Solution {
    public int sumOfGoodIntegers(int n, int k) {

       int start = Math.max(1,n-k);

       int sum = 0;

       for(int x = start ; x <= n + k ; x++)
       {
        if((x&n) == 0)
        {
            sum += x;
        }
       }
       return sum;
    }
}