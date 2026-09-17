class Solution {
    public int divide(int numer, int de) {

        boolean sign = true;
        if(numer >= 0 && de < 0)
        {
            sign = false;
        }
        if(numer <=0 && de > 0) sign = false;

        long n = Math.abs((long)numer);
        long d = Math.abs((long)de);
        long ans = 0;
        while( n >= d)
        {
            int cnt = 0;
            while( n >= ((d << cnt + 1)))
            {
                cnt = cnt + 1;
            }
            ans += 1L << cnt;
            n = n - (d << cnt);
        }
        
        if(sign)
        {
            if(ans > Integer.MAX_VALUE )
            {
                return Integer.MAX_VALUE;
            }
            return (int)ans;
        }
        else
        {
            if(ans > (long)Integer.MAX_VALUE + 1)
            {
                return Integer.MIN_VALUE;
            }
            return (int)-ans;
        }
        
        //return (int)ans > 0 ? (int)ans : (int)-1L * ans;
    }
}