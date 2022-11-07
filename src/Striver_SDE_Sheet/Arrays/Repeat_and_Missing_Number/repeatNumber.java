package Striver_SDE_Sheet.Arrays.Repeat_and_Missing_Number;

import java.util.Arrays;
import java.util.HashMap;

public class repeatNumber {
    public static void main(String[] args){
        int[] arr = {3,1,2,5,3};
        System.out.println(Arrays.toString(repeatedNumber(arr)));
    }
    public static int[] repeatedNumber(final int[] A) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int i;
        int n=A.length;
        for(i=1;i<=n;i++){
            map.put(i,0);
        }
        for(i=0;i<n;i++){
            map.replace(A[i],map.get(A[i])+1);
        }
        int a=0,b=0;
        for(i=1;i<=n;i++){

            if(map.get(i)>1){
                a= i;
            }
            if(map.get(i)==0){
                b=i;
            }
        }
        int[] ans={a,b};
        return ans;
    }
}
