package day33_methods;

/*
Armstrong numbers are  ====153 370 371 407 ===for 3  digits
                      153 = (1*1*1) + (5*5*5)  + (3*3*3)
                               1     +    125  +    27  = 153

                      3 -----153%10 ----153 / 10  = 15
                      5------15%10 ---- 15/ 10    = 1
                      1------1%10 ------1/ 10     = 0

                      0 -----. when we got this result, it means stop execution

            To see div / remainder operator
                      153 % 3 ------0
                      153 / 3  ----   51
*/

 public class ArmstrongNumber {

     public static void main(String[] args) {

         for (int i = 100; i <1000 ; i++) {

         }
         isArmstrong(153);


     }

     public static void isArmstrong (int number){

         int lastDigit = 0;
         int totalDigit = 0;
         int originalNumber=number;

         while (number >0){
             lastDigit = number % 10 ;    // to find last digit

             System.out.println(lastDigit);

             number /= 10;  // number =number /10

             totalDigit += lastDigit *lastDigit *lastDigit;
             // Math class  --- has pow method

         }
         System.out.println(totalDigit);

         if(totalDigit == originalNumber){
             System.out.println(originalNumber);
         }

     }


}
