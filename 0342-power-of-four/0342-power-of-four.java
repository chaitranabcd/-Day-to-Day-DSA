class Solution {
    public boolean isPowerOfFour(int n) {

        if((n & (n-1)) !=0)
        {
            return false;
        }
        for(int i = 0 ; i < 31 ; i+=2)
        {
            if( (n & (1 << i)) != 0)
            {
                return true;
            }
        }
        return false;
    }
}