package day47_encapsulation;

public class Bank {
    public static void main(String[] args) {
        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1123456789154751L,"James",10_000_000 );
        System.out.println("\n"+obj1);

        System.out.println();
        DebitCard obj2 = new DebitCard(1023456789154351L,"Ben",100_000_002);
        System.out.println(obj2);
        System.out.println(obj2.accountType);
        System.out.println();

        // Valid values
        DebitCard obj3 = new DebitCard(1023456589150151L,"Fred","visa", 7000,1000000045);
        System.out.println(obj3);

        // InvValid values
        System.out.println();
        DebitCard obj4 = new DebitCard(54123456789111L,"Moss","Money", 7,100_045);
        System.out.println(obj4);

    }
}
