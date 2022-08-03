package Data_Structure.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_Dimensional_Array {
    public static void main(String[] args) {
        /*

    int [][]multi = {
                     {23,45,67,89,34},
                     {81,76,83,98},
                     {68,71,93,44,86,79}
                            };
               >>Here number of rows are 3 and numbers of column are variable.
               So, that's why you have to mandatory specify rows.
               Here we have 2Dimensions for our array so they are called 2D array.
               We can also make 3D array but they are difficult to memorize.
                            */
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][];
        //You can specify size of rows and columns in these rectangular boxes.
        // It is mandatory to define size of row, you can leave the size of column

//        arr[0][1]=44;
        //for taking input
        for (int row = 0; row < arr.length; row++) { //This loop will run for every row
            for (int col = 0; col < arr[row].length; col++) { //This loop will run for every index of row
                arr[row][col] = in.nextInt(); //here we are taking input.

            }
        }
        //for printing output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(" ");
        }
        //we can also use for each loop
        for (int[] arrra : arr){
            System.out.println(Arrays.toString(arrra));
            System.out.println(" ");
            //this will print our array in matrix format.
        }
    }


}
