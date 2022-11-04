package Striver_SDE_Sheet.Arrays.Largest_subarray_with_0_sum;


import java.util.HashMap;

public class largest_subarray {
    public static void main(String[] args){
        int[] arr = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(arr));
    }
    public static int maxLen(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int sum = 0;
        int length = 0;

        for(int i=0 ; i<arr.length; i++){

            sum+=arr[i];

            if (sum == 0){
                length = i+1;
            }
            Integer prev = map.get(sum);


            if (prev != null)
                length = Math.max(length, i - prev);
            else
                map.put(sum, i);
        }
        return length;
    }
}
