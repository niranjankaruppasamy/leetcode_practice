import java.util.*;

class MedianOfTwoSortedArrays {
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n = nums1.length;
      int m = nums2.length;
      int i=0,j=0;
      int mid = (n+m)/2;
      int[] res = new int[n+m];
      Arrays.fill(res, -1);
      while(i+j<n+m) {
          if (nums1[i]<=nums2[j]) {
              res[i+j] = nums1[i];
              i++;
          } else {
              res[i+j] = nums2[j];
              j++;
          }
          if (res[mid+1] != -1) {
              if(n+m%2==0) {
                  return (res[mid]+res[mid+1])/2;
              }
              return res[mid];
          }
      }
      return -1.00;
  }
  
  public static void main(String[] args) {
    int[] arr1 = {1,3};
    int[] arr2 = {2};
    System.out.println(MedianOfTwoSortedArrays.findMedianSortedArrays(arr1, arr2));
  }
}