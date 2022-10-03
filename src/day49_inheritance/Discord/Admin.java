package day49_inheritance.Discord;

public class Admin extends DiscordUser {

    String admin;

    public Admin(String admin, String name, int id ){
        super(admin, name, id);
    }
    public void createChannel(){
        System.out.println(name + " is creating new discord channel");
    }
}

