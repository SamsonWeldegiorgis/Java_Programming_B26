package day51_inheritance.device;

public class UseDevice{
    public static void main(String[] args) {



        TV user1 = new TV("LG", 2022, 1300, false);
        System.out.println(user1);

        user1.useDevice();


        Phone user2 = new Phone("IPhone",2021,1600,true);
        System.out.println(user2);
        user2.useDevice();






    }



}
