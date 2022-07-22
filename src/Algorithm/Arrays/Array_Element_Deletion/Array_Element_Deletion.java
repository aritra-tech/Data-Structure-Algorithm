import java.util.Arrays;
import org.apache.commons.lang.ArrayUtils;

public class RemoveObjectFromArray{

    public static void main(String args[]) {
                 
        int[] test = new int[] { 101, 102, 103, 104, 105};
     
        System.out.println("Original Array : size : " + test.length );
        System.out.println("Contents : " + Arrays.toString(test));
     
        test = ArrayUtils.remove(test, 2); //removing element at index 2
     
        System.out.println("Size of the array after removing an element  : " + test.length);
        System.out.println("Content of Array after removing an object : " + Arrays.toString(test));
    }
}
