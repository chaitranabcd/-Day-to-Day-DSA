class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) 
    {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int [] arr = new int [n1+n2];

        for(int i = 0 ; i < n1 ; i++)
        {
            arr[i] = arr1[i];
        } 
        for(int i = 0 ; i < n2 ; i++)
        {
            arr[i+n1] = arr2[i];
        }  

        int x = arr.length;

        Arrays.sort(arr);
        

        if(x%2 == 0)
        {
            return (arr[x/2 - 1] + arr[x/2])/2.0;
        }
        else
        {
            return (arr[x/2]);
        }

    }
}