package day1_04_04_2022;

public class P02_CheckSix {
    public static void main(String[] args) {



    /*
       6
         int[] x = {1,2,6};  ---> true
         int[] y = {6,3,5,7,9};  ---> true
         int[] z = {2,6,6,6,6,1};  ---> false
     */
        int[] z = {2,6,3,5,7,9,6};

//        int[] y = new int[4];
//        y[0] = 10;
//        y[1] = 20;
//        y[2] = 30;
//        y[3] = 140;

        int firstElement = z[0];
        int lastElement = z.length - 1;   // z[z.length-1];

        if (firstElement == 6 || lastElement == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }}




