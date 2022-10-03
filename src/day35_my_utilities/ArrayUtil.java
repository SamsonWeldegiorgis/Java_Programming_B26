package day35_my_utilities;

import java.util.Arrays;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] b = addElement(a1, 4);
        System.out.println(Arrays.toString(b)); // 1,2,3,4

        System.out.println("------------------------------");

        String[] c = {"mussa", "tommy"};
        String[] d = addElement(c, "chewata");
        System.out.println(Arrays.toString(d));

        System.out.println("------------------------------");

        int [] y ={5,23,6,21};
        int [] z ={3,23,6};
        System.out.println(Arrays.toString(addElement(y,z)));
    }

        /*
    Min Number

create a method that will accept an int array and return the smallest number from the array
     */

    public static int minNumber(int[] nums) {

        int min = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;

            }
        }
        return min;
    }

    // Max number

    public static int maxInNumber(int[] nums) {

        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;

            }
        }
        return max;
    }

    public static boolean contains(int[] nums, int element) {

        for (int each : nums) {
            if (each == element) {
                return true;
            }
        }
        return false;


    }


    public static int[] addElement(int[] original, int elementToAdd) {
        int[] newArray = new int[original.length + 1];

        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        // instead of doing a loop ourselves, we could have used Arrays.copyOf()
        newArray[newArray.length - 1] = elementToAdd;
        return newArray;
    }

    public static String[] addElement(String[] original, String element) {

        String[] newArray = new String[original.length + 1];

        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        newArray[newArray.length - 1] = element;
        return newArray;

//        return null;
    }

    public static int [] addElement(int[] original, int[] elementsToAdd) {// adding multiple arrays

        int[] newArray = new int[original.length + elementsToAdd.length];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            //added the elements from the original array in the new array
            if (i < original.length) {
                newArray[i] = original[i];
            } else {
                // added the new elements to the new array
                newArray[i] = elementsToAdd[j++];
            }

        }
        return newArray;
    }
}
