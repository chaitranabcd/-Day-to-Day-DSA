class Solution {
    public String addBinary(String a, String b) {
        // convert decimal to deciemal

        
        // int len1 = a.length();
        // int p1 = 1;
        // int res1 = 0;
        // for(int i = len1 - 1 ; i >= 0; i--)
        // {
        //     if(a.charAt(i) == '1')
        //     {
        //         res1 += p1;
        //     }
        //     p1 = p1 * 2;
        // }
        // int len2 = b.length();
        // int p2 = 1;
        // int res2 = 0;
        // for(int i = len2 - 1 ; i >= 0; i--)
        // {
        //     if(b.charAt(i) == '1')
        //     {
        //         res2 += p2;
        //     }
        //     p2 = p2 * 2;
        // }


        // int ans = res1 + res2;


        // /// convert to binary;- > string
        // String str = "";

        // if(ans == 0)
        // {
        //     return "0";
        // }
        // while(ans != 0)
        // {
        //     if(ans%2 == 1)
        //     {
        //         str = '1' + str;
        //     }
        //     else
        //     {
        //         str = '0' + str;
        //     }
        //     ans /= 2;
        // }

        // return str;



        // two pointer;

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder str = new StringBuilder();
        while( i>=0 || j >= 0 || carry != 0)
        {
            int sum = carry;

            if(i >= 0)
            {
                sum += a.charAt(i--) - '0';
            }

            if(j >= 0)
            {
                sum += b.charAt(j--) - '0';
            }
            str.append(sum%2);

            carry = sum / 2;
        }

        str.reverse();

        return str.toString();
    }
}