package day49_inheritance.StudentTask;

public class School {

    public static void main(String[] args) {

//        Student student = new Student("",24) { // not possible to initia Abstract class

        OnlineStudent onlineStudent=new OnlineStudent("Mike",25,"B26");
        System.out.println(onlineStudent);
        onlineStudent.attendClass();
        onlineStudent.sleep();


            }
        }

