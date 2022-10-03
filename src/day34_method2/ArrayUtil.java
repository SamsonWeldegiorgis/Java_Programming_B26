package day34_method2;
/*
Utility Classes
Create the following in the StringUtil class:
 */
public class ArrayUtil {

    public static int min(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int max (int [] arr){
        int biggest = arr [0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > biggest){
                biggest = arr[i];

            }
        }return biggest;
    }
}
