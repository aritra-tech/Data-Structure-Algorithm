package Algorithm.Searching.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class kth_smallest_element {
    // function to find k-th largest element
    static int kthSmallest(ArrayList<ArrayList<Integer>> mat, int k)
    {
        int n = mat.size();

        if(k > n*n)
            return -1;

        // smallest element is the first element of the matrix
        if(k == 1)
            return mat.get(0).get(0);

        // define array and push contents of the matrix into it
        ArrayList <Integer> arr = new ArrayList <Integer>();
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr.add(mat.get(i).get(j));

        // sort the array and obtain k-th smallest element
        Collections.sort(arr);

        return arr.get(k-1);
    }
    public static void main (String[] args)
    {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
        mat.add(new ArrayList<Integer>(Arrays.asList(11, 21, 31, 41)));
        mat.add(new ArrayList<Integer>(Arrays.asList(16, 26, 36, 46)));
        mat.add(new ArrayList<Integer>(Arrays.asList(25, 30, 38, 49)));
        mat.add(new ArrayList<Integer>(Arrays.asList(33, 34, 40, 50)));

        int k = 3;
        int kthsmall = kthSmallest(mat,k);

        if(kthsmall == -1)
            System.out.println("3rd smallest element doesn't exist.");
        else
            System.out.println("3rd smallest element = "+kthsmall);

    }
}
