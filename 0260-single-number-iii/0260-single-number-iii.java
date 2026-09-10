class Solution {
    public int[] singleNumber(int[] nums) {
        
        int [] res = new int[2];

        int n = nums.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n ; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        int j = 0;
        for(int i = 0 ; i < n ; i++)
        {
            int x = map.get(nums[i]);
            if(x == 1)
            {
                res[j++] = nums[i];
            }
        }
        return res;

    }
}