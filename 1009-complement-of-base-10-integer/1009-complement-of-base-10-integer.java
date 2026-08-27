class Solution {
    public int bitwiseComplement(int n) 
    {
        //int n = 5;
        String res = "";
        if(n==0)
        {
            return 1;
        }
        while(n!=0)
        {
            if(n%2 == 0)
            {
                res = '0' + res;
            }
            else
            {
                res = '1' + res;
            }
            n = n /2;
        }
        System.out.println(res);

        String s = "";

        for(char ch : res.toCharArray())
        {
            if(ch == '1')
            {
                s += '0';
            }
            else
            {
                s += '1';
            }
        }
        System.out.println(s);

        int x = s.length();
        int r = 0;

        int power = 1;
        for(int i = x - 1 ; i >= 0 ; i--)
        {
            if(s.charAt(i) == '1')
            {
                r += power;
            }
            power *= 2;
        }

        System.out.println(r);
        return r;
    }
}