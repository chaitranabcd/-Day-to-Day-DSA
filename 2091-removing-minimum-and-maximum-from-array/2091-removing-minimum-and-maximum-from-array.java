class Solution {
    public int minimumDeletions(int[] nums) {
    
        int n = nums.length;

        if(n == 1)
        {
            return 1;
        }
        int minIndex = 0;
        int maxIndex = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] > nums[maxIndex])
            {
                maxIndex = i;
            }

            if(nums[i] < nums[minIndex])
            {
                minIndex = i;
            }
        }
        System.out.println(maxIndex + " " + minIndex);

        int front = Math.max(minIndex,maxIndex) +1;

        int back = n - Math.min(minIndex,maxIndex);

        int both = (minIndex + 1) + (n - maxIndex);

        int both1 = (maxIndex + 1) + (n-minIndex); 
        
        int res = Math.min(front,Math.min(back,Math.min(both, both1)));

        System.out.println(res);

        return res;



    }
}