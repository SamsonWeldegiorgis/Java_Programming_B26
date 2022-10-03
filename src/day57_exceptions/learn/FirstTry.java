package day57_exceptions.learn;

public class FirstTry {
    public static void main(String[] args) {


        System.out.println("First Line");



        try{
            String word = "java";

            System.out.println(word.charAt(100));


        }catch (Exception e){
            System.out.println("Exception happened");

        }

        System.out.println("Last Line");

        System.out.println("============================ ");

        System.out.println("First Line");

        try{
            String word = "Java";
            System.out.println(word.charAt(0));
        }catch (Exception e){
            System.out.println("Exception happened");
        }
        System.out.println("Last Line");
    }
}
