class Solution {
    public String interpret(String str) {
        
        StringBuilder res = new StringBuilder();

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == 'G')
            {
                res.append("G");
            }
            else if(str.charAt(i) == '(' && str.charAt(i+1) == ')')
            {
                res.append("o");
                i += 1;
            }
            else
            {
                res.append("al");
                i += 3;
            }
        }
        return res.toString();
    }
}