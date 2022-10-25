package Striver_SDE_Sheet.Arrays.Merge_Sorted_Array;

public class mergearray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3 , n = 3;
        int[] nums2 = {2,5,6};

        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1, j = n-1, k = (m+n)-1;
        while(i>=0 && j>=0){
            if(nums1[i]<nums2[j]){
                nums1[k--] = nums2[j--];
            }else{
                nums1[k--] = nums1[i--];
            }
        }
        //If length of nums2 is more than length of nums1
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }
}
