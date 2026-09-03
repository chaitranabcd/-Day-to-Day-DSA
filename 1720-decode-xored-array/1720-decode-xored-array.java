class Solution {
    public int[] decode(int[] encoded, int first) {

        int n = encoded.length;

        int []nums = new int[n+1];

        nums[0] = first;
        int i;
        for(i = 1 ; i < n ; i++)
        {
            nums[i] = (encoded[i-1]^nums[i-1]);
        }
        nums[i] = (encoded[n-1]^nums[n-1]);
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}