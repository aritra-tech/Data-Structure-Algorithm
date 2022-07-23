package Algorithm.Recursion;

public class SearchingInArray {
    public static void main(String[] args) {
        int[] array = {5,6,7,8,9,10,1,2,3};
        System.out.println(findInArr(array, 100,0) );
        System.out.println(findIndexArr(array, 10,0) );
    }

    static boolean findInArr(int[] arr, int target, int index){
        if(index == arr.length-1){
            return false;
        }
        return arr[index] == target || findInArr(arr, target, index +1);
    }

    static int findIndexArr(int[] arr, int target, int index){
        if(index == arr.length-1){
            return -1;
        } else if (arr[index] == target){
            return index;
        }
        return  findIndexArr(arr, target, index +1);
    }
}
