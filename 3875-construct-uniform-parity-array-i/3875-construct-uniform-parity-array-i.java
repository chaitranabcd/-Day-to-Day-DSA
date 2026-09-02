class Solution {
    public boolean uniformArray(int[] nums1) 
    {
        int n = nums1.length;
        int even = 0 , odd = 0;
        for(int num : nums1)
            {
                if(num%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
        if(odd == n || even == n) return true;
        int [] nums2 = new int[n];
        for(int i = 0 ; i < n ; i++)
            {
                if(nums1[i] % 2 == 0)
                {
                    for(int  j = 0 ; j <n ;j++)
                        {
                            if(nums1[j] % 2 == 1)
                            {
                                nums2[i] = nums1[i] - nums1[j];
                                break;
                            }
                        }
                }else
                {
                    nums2[i] = nums1[i];
                }
            }
        return true;
    }
}