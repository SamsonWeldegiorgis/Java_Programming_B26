package day49_inheritance.Discord;

public class Student extends DiscordUser{

    String student;

    public Student (String student, String name, int id){
        super(student,name, id );


    }
    public void sendMessage(){
        System.out.println(name + " is sending message to class chat");
    }

}
