package Algorithm.Arrays.Basic_Operations.Intro;

import java.util.Arrays;
import java.util.Scanner;

public class Introduction_to_Array {

    public static void main(String[] args) {
        /*Array- Array is a Data Structure used to store a collection of data of similar data types.
    Syntax-->>
    data type[] variable_name = new data type[size];
    int [] arr = new int [(size of array)];


    Here,
    * (int) represents the type of data stored in array.
    * new keyword is used to create an object in heap memory of array.


    int [] arr ; <-- declaring an array
    arr = new int [size];<-- initializing an array

    We can also declare and initialize an array like this:
    int [] prr = {34,12,66,89,34,78,444,91}; <-- stores similar type of data
    Note-->>
    * In c++ array objects are stored in continuous memory location
      but in java it is totally depends on JVM.
    * If we don't provide values in the array then it will internally by-default
      stores like this[0,0,0,0,0,0] for the same size of array that is declared above.
    * Same for String data type but in this it will store null value like this [null,null,null,null]

    */
        int []arr = new int [4];
        int prr[] =new int [5];
        //both convention are correct
        String [] str = new String[] {"Hack","Projects","OpenSource","Define"};//this is also correct
        int [] vrr = new int [6];

        vrr[0]=56;
        vrr[1]=76;
        vrr[2]=96;
        vrr[3]=32;
        vrr[4]=543;
        vrr[5]=71;
        //Array index starts from 0 and goes till (size-1)
        //Now lets see how we can take input in array
        int [] id = new int[6];
        System.out.println(id.length);//for printing length of array

        Scanner in = new Scanner(System.in);
        for (int index = 0; index <id.length ; index++) { //here id.length is a variable which will provide yo
            id[index]=in.nextInt();

        }
        //for printing
        for (int index = 0; index < id.length; index++) {
            System.out.print(id[index]+ " ");

        }

        //we can also use a different method to print array
        System.out.println(Arrays.toString(id));
        //This will print our array data in a good manner:[34,54,3,5246,67]

        // We can also use for each loop
        for (int nums:id) {
            System.out.println(nums);
        }
        //Arrays mutability
        int []num = {1,2,3,4,5};
        System.out.println(num[2]);
        change(num);
        System.out.println(num[2]);
        //it will change the index 2 object because arrays are mutable

    }

     static void change(int [] i) {
        i[2]=56;
    }
}
