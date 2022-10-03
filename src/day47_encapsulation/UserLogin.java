package day47_encapsulation;

public class UserLogin {

    public static void main(String[] args) {
        Login obj = new Login();
//        obj.userName= "JamesBond";
//        obj.passWord = "1234";

        // canNOT access private variables directly

        obj.setUserName("James Bond");
        obj.setPassWord("12345");

//        System.out.println(obj.userName);
//        System.out.println(obj.passWord);

        System.out.println("UserName: " +obj.getUserName());
        System.out.println("PassWord: " + obj.getPassWord());



        obj.setUserName("James007Bond");
        System.out.println("Updated UserName : " +obj.getUserName());





    }

}
