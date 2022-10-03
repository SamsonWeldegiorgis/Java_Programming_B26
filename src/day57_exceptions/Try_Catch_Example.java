package day57_exceptions;

public class Try_Catch_Example {
    public static void main(String[] args) {



            try{
        System.out.println(9/0);
        System.out.println("try block");
    }catch (RuntimeException e) {  // ArithmeticException e
//            e.printStackTrace();
//            System.out.println(e.getMessage());
        System.out.println("Caught block");
//            System.exit(0);




    }finally {
        System.out.println("Finally Block");
    }
        System.out.println("Hello");
}
    }


