package day49_inheritance.Discord;

public class DiscordUser {

    String role;
    String name;
    int id;

    public DiscordUser(String role, String name, int id){
        this.role=role;
        this.name=name;
        this.id=id;

    }

    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
