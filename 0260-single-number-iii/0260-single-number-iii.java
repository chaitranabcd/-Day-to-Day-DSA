class Solution {
    public int[] singleNumber(int[] nums) {
        
        // int [] res = new int[2];

        // int n = nums.length;

        // Map<Integer,Integer> map = new HashMap<>();

        // for(int i = 0; i < n ; i++)
        // {
        //     map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        // }
        // int j = 0;
        // for(int i = 0 ; i < n ; i++)
        // {
        //     int x = map.get(nums[i]);
        //     if(x == 1)
        //     {
        //         res[j++] = nums[i];
        //     }
        // }
        // return res;

        int n = nums.length;
        int xorr  = 0;
        for(int i = 0 ; i < n ; i++)
        {
            xorr ^= nums[i];
        }
        int rightSetBit = (xorr & xorr - 1) ^ xorr;
        int b1 = 0, b2 = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if( (nums[i] & rightSetBit) != 0)
            {
                b1 ^= nums[i];
            }
            else
            {
                b2 ^= nums[i];
            }
        }
        return new int[] {b1,b2};

    }
}