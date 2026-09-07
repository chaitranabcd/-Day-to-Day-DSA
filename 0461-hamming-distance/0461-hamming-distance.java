class Solution {
    public int hammingDistance(int x, int y) {
        
        int z = x^y;
        int cnt = 0;
        while(z>1)
        {
            cnt+= z&1;
            z >>=1;
        }
        if(z==1)
        {
            cnt++;
        }
        return cnt;
    }
}