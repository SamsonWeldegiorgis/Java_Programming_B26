package day28_arrayPractice;

public class AverageNumbers {
    public static void main(String[] args) {
        /*
        example : [1,2,3,] - > ave is 2  .....[10,15,5,6] - > ave is 9 [4,5,6,7,8,10,20,30,0] ...ave 10
         */
//
        int [] num = {1,2,3,6};
        int sum = 0 ;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];

        }
        System.out.println("sum : " + sum);
        System.out.println("AverageTraditional :"+ (sum/num.length)); // traditionally



        int [] num1 = {4,5,6,7,8,10,20,30,0};
        int sum1 = 0 ;
        System.out.println();

        for (int each : num1){
            sum1+=each;
        }
        System.out.println("AverageEach: "+(sum1/num1.length));// for Each

        System.out.println();

      int [] num2 = {1,2,3};
        int sum2 = 0 ;
     for (int j=0; j<num2.length; j++){
         sum2+=num2[j];
     }
         System.out.println("Average: " + (sum2/num2.length));// traditionally
     }
}
