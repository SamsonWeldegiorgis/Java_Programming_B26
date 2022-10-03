package day52_inheritance.Amazon;

public class UseAmazon {

    public static void main(String[] args) {

        AmazonAccount user1 = new AmazonAccount("James", "james@amazon", true);
        System.out.println("User1 : "  + user1);

        AmazonAccount user2 = new AmazonAccount("batman" , "secretIdentty@gmail.com", false );

        user2.setUserName("BruceW");
        user2.setEmail("bruce@wayne_enterprise.com");
        user2.setHasPrime();
        System.out.println("User2 : " + user2);
    }
}
