package leetcode.twoSortedMedian;

import java.util.Arrays;

public class TwoSortedMedian {
    public static void main(String[] args) {
        int[] array1 = {1,2,4,8,12};
        int[] array2 = {5,7,3,6};
        System.out.println(findMedianSortedArrays(array1,array2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length+ nums2.length];
        int counter = 0;
        for(int i:nums1) {
            mergedArray[counter] = i;
            counter++;
        }
        for(int i:nums2) {
            mergedArray[counter] = i;
            counter++;
        }
        Arrays.sort(mergedArray);
        double median = mergedArray.length%2==0 ?
                ((double) (mergedArray[mergedArray.length/2]+mergedArray[mergedArray.length/2-1])/2) :
                ((double) mergedArray[mergedArray.length/2]);
        return median;
    }
}
