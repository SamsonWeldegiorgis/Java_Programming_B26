package day1_04_04_2022;

public class ArraysRecap {
    /*
    Array = an object that can hold multiple values of same datatype simultaneously.
    Index  starts with ZERO. (like strings)

    -Declaration : new int, new keyword
    -Instantiation : creating an object
    -Initialization : assigning values

     */

    public static void main(String[] args) {
        int a ;
        // declaration
        int [] nums ;
//        nums [0] = 3; // not declared not valid

        // instantialtion : creating an object
        nums = new int[4] ;  // [0,0,0,0 ] (initializes my array with default values)
        nums[0]= 5; // [5,0,0,0]

        //declaration + instantiation at same line
        int [] nums2 = new int [3]; // [0,0,0]  // by default it gets

        // initialization
        int  [] num3 = {1,2,3,4}; //  [1,2,3,4]  .. creating arrays n

        int [] nums4 = new int []{10,20,30}; // .. creating our arrays no defalut[2] or [10]






    }
}
