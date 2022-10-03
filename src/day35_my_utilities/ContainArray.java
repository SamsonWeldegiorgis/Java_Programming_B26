package day35_my_utilities;

public class ContainArray {

    /*
    Contains

create a method that will accept an int array and an int number.
Check and return if the given number is in the array.
     */
public static boolean contains (int [] nums, int element){

    for (int each : nums ) {
        if (each == element){
            return true;
        }
    }
    return false;


}

    public static void main(String[] args) {
        int [] a = {3,12,1,7,1,20};

        System.out.println(contains(a,12));
    }

}
