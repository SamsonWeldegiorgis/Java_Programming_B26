package day57_exceptions.learn;

public class FifthTry {

    public static void main(String[] args) {

        try{
            System.out.println("start");
            Thread.sleep(-2000);
            System.out.println("Finish");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(" -------------------------------------");
        try{
            System.out.println("start");
            Thread.sleep(-2000);
            System.out.println("Finish");

        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
    }

