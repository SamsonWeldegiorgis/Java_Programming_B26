package day40_arrayList_more;

public class SumOfDigits {


        /*
        input : "jav45ai1000sgre1at82"; ....output  = 1128
     */


        public static void main(String[] args) {
            String str = "ja45v54a1";
            System.out.println(sumOfDigits(str));
}

         public static int sumOfDigits(String str) {

             String digits = "0";

             int sum = 0;
                for (int i = 0; i < str.length(); i++) {

             if (Character.isDigit(str.charAt(i))) {

                digits += str.charAt(i);
            } else {
                sum+= Integer.parseInt(digits);
                digits = "0";  // we put 0 into digits : if not any number in string , it will give us NumberFormatingExceptions                                               // since 0 has no effect to result addition (+) operator, we used it to prevent Errors
            }
        }
        return sum+Integer.parseInt(digits);
    }}