package day43_constructors;

public class UsingPhone {
    public static void main(String[] args) {

        Phone pho = new Phone("Iphone X");
        System.out.println(pho);

        Phone pho2= new Phone ("IPhone 12","Apple");
        System.out.println(pho2);

        Phone pho3= new Phone ("Galaxy s 22","Samsung",128 , 10.2);
        System.out.println(pho3);

    }
}
