package day43_constructors;

public class UsingOffer1 {

    public static void main(String[] args) {

        Offer job1 = new Offer("Google");
        System.out.println(job1);

        Offer job2= new Offer("Google", "Seattle");
        System.out.println(job2);

        Offer job3 = new Offer("Google", "Seattle" , 120_000);
        System.out.println(job3);

        Offer job4 = new Offer("Google", "Seattle" , 120_000,true, 8);
        System.out.println(job4);




    }
}
