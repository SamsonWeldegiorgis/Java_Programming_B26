package day36_overlloadin_method;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = addElement(a, 4);
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

        int [] newArray = new int [original.length + elementsToAdd.length];

        for (int i = 0, j=0; i < newArray.length; i++) {
            //added the elements from the original array in the new array
            if( i < original.length) {
                newArray[i] = original[i];
            } else{
                // added the new elements to the new array
                newArray[i]= elementsToAdd[j++];
            }

        }
        return newArray;


    }}


//  //////////////additional from students
//    public static String [] addElementToArray(String [] original, String elementToAdd){
//        String[]newArray=new String[original.length+1];
//        for (int i = 0; i <original.length ; i++) {
//            newArray[i]=original[i];
//        }
//        newArray[newArray.length-1]=elementToAdd;
//        return newArray;
//
//    }
//    public static int [] addElementToArray(int [] original, int[] elementToAdd){
//        int[]newArray=new int[original.length+ elementToAdd.length];
//
//        for (int i = 0; i <original.length ; i++) {
//            newArray[i]=original[i];
//        }
//        for (int i = original.length, j=0; i < newArray.length ; i++,j++) {
//            newArray[i]=elementToAdd[j];
//        }
//        return newArray;
//    }

