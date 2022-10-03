package day36_overlloadin_method;

import javax.imageio.spi.IIOServiceProvider;

public class Login_MethodOverloadingExample {
    /*
    Advantages :
    - Reusabilit
    - Flexible
    - Easy to memorize :
            Bad practice :  sum1( int a , int b)
            good practice : sum ( int a, int b)

      - Number of the parameter = overloading
      add ( int a , int b )
      add ( int a  )
      add ( )

      - Datatypes of parameters = overlading
       add ( int a ,float b)
       - Sequence of aparamenter
         -

      if method signiture are same , we can't say there is Overlaoding.
      Method signiture  - it includes method name + parameters

      * Can we overlaod main method ? Yes by changing datatypes...
      * Java prints the String 1st main method,,,if not main method,,,no printing

     */

    public static void main(String[] args) {

        boolean isLoginSuccess=login("Cydeo","Cydeo123");

        if(isLoginSuccess){
            System.out.println("Welcome to CYDEO");
        }else {
            System.err.println("Check your password");
        }

        System.out.println("====================");

        isLoginSuccess=login();

        if(isLoginSuccess){
            System.out.println("Welcome to CYDEO");
        }else {
            System.err.println("Check your password");
        }

    }

    public static boolean login(String username,String password){


        if(username.equalsIgnoreCase("cydeo") && password.equalsIgnoreCase("cydeo123")){
            return true;
        }
        return false;

    }

    public static boolean login(){

        String username=getUsername();
        String password=getPassword();

        if(username.equalsIgnoreCase("cydeo") && password.equalsIgnoreCase("cydeo123")){
            return true;
        }
        return false;

    }

    public static String getPassword() {

        // Assume that we get this infor from external file

        return "Cydeo123";
    }

    public static String getUsername() {
        // Assume that we get this infor from external file

        return "Cydeo";
    }

}
