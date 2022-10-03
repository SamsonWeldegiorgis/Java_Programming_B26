package day46_static;

public class UseIPhone {
    public static void main(String[] args) {

        IPhone phone= new IPhone("iPhone X", 1000);
        System.out.println(phone);

        IPhone phone2 = new IPhone("IPhone XI", 1200);
        System.out.println(phone2);

        System.out.println(IPhone.company);
        System.out.println(IPhone.os);
        System.out.println("What is today:"+ IPhone.day);
        System.out.println("Is today Friday: " + IPhone.appleDay);

    }
}
