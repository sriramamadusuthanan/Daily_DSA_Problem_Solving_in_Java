package Array;

public class MedianOfArray {

    public static void main(String[] args) {

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans=0;
        //to ensure the num1 is smaller range to ensure binarysearch range
        if(nums1.length>nums2.length)
        {
            return findMedianSortedArrays(nums2,nums1);
        }
        int m=nums1.length;
        int n=nums2.length;
        int low=0 ,high=m;
        while(low<=high)
        {
            
        }
        return ans;
    }
}
