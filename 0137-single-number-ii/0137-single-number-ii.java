class Solution {
    public int singleNumber(int[] nums) {
        
        // int n = nums.length;

        // Map<Integer,Integer> map = new HashMap<>();

        // for(int i = 0 ; i < n ; i++)
        // {
        //     map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        // }

        // for(int i = 0 ; i < n ; i++)
        // {
        //     if(map.get(nums[i]) == 1)
        //     {
        //         return nums[i];
        //     }
        // }
        // return 0;

        // int n = nums.length;
        // int ans = 0;
        // for(int num = 0 ; num < 32 ; num++)
        // {
        //     int cnt = 0;
        //     for(int i = 0 ; i <  n ;i++)
        //     {
        //         if((nums[i] & (1<<num)) != 0)
        //         {
        //             cnt++;
        //         }
        //     }
        //     if(cnt%3==1)
        //     {
        //         ans = ans | (1<<num);
        //     }
        // }
        // return ans;


        // int n = nums.length;
        // Arrays.sort(nums);
        // for(int i = 1 ; i < n ; i+=3)
        // {
        //     if(nums[i] != nums[i-1])
        //     {
        //         return nums[i-1];
        //     }
        // }
        // return nums[n-1];


        int ones = 0;
        int twos = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {
            ones = (ones ^ nums[i]) & ~(twos);
            twos = (twos ^ nums[i]) & ~(ones);
        }
        return ones;
    }


}