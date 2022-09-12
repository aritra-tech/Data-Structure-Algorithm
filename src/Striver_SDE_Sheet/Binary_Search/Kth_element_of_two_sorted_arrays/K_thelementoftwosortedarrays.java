package Striver_SDE_Sheet.Binary_Search.Kth_element_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.Collections;

public class K_thelementoftwosortedarrays {
    public static void main(String[] args){
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;
        int n = 0;
        int m= 0;
        System.out.println(kthElement(arr1,arr2,k,n,m));
    }

    private static long kthElement(int[] arr1, int[] arr2, int n, int m, int k) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a1.add(arr1[i]);
        }
        for(int i=0;i<m;i++)
        {
            a1.add(arr2[i]);
        }
        Collections.sort(a1);
        if(k==0)
        {
            int val = a1.get(k);
            return (long)val;
        }
        int v = a1.get(k-1);
        return (long)v;
    }
}
