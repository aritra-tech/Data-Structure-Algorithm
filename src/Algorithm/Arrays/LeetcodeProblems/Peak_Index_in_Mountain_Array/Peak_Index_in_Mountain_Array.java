package Algorithm.Arrays.LeetcodeProblems.Peak_Index_in_Mountain_Array;

public class Peak_Index_in_Mountain_Array {

    public static void main(String[] args){
      int[] arr = {0,1,0};
      System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
      int l = 0;
      int r = arr.length - 1;

      while (l < r) {
        final int m = (l + r) / 2;
        if (arr[m] < arr[m + 1])
          l = m + 1;
        else
          r = m;
      }

      return l;
    }
  }