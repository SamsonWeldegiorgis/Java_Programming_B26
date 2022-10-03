package day30_arraysForEach;

import java.util.Arrays;

public class FouthLargest_SorterArray {
    public static void main(String[] args) {
        /*
         Create a method that returns the 4th largest number of given int array

       Eg;  int[] arr  ={2 , 56 , 0 , 25 , 1 , 75 , 9 , 8}; ---> 9
            int[] arr2 ={1 , 2 , 3 , 9 , 0 };  ---> 1
         */

        int[] arr  ={2 , 56 , 0 , 25 , 1 , 75 , 9 , 8};
        int[] arr2 ={1 , 2 , 3 , 9 , 11 };

        System.out.println(Arrays.toString(arr));
        System.out.println("Forth : " + forth(arr));
       System.out.println(Arrays.toString(arr2));
        System.out.println("Forth : " + forth(arr2));
        System.out.println();

//        FouthLargest obj = new FouthLargest();
//        System.out.println(Arrays.toString(arr));
        System.out.println("ARR: " + Arrays.toString(arr));
        System.out.println("Forth2 : " + forth2(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Forth2 : " + forth2(arr2));

    }


    public static int forth (int [] arr){

        Arrays.sort(arr);Arrays.sort(arr);
        return arr[arr.length-4];

        // or
    }
    public static  int forth2(int [] arr){
        int temp=0;
        for (int i = 0; i <arr.length; i++) {
            for (int j=  i+1 ; j <arr.length; j++) {
                if (arr[j] < arr[i]){
                    temp= arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;

                }
            }
        }

        return arr[arr.length-4];
    }
}
