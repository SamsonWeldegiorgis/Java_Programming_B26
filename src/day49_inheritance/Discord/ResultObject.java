package day49_inheritance.Discord;

public class ResultObject {
    public static void main(String[] args) {

   DiscordUser user1 = new DiscordUser("Manager","John", 51);
        System.out.println("\n"+user1);

        Student student1=new Student("Student","Mussie", 55);
        System.out.println("\n"+student1);
        student1.name="Tomas";
        student1.sendMessage();

        Admin ad1= new Admin("Ad","Tom",12);
        System.out.println("\n"+ad1);
        ad1.name="George";
        ad1.createChannel();




    }
}
