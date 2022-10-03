package day49_inheritance.StudentTask;

public class OnlineStudent extends Student{

    public OnlineStudent(String name, int age, String batchNumber) {
        super(name, age, batchNumber);
    }

    @Override
    public void sleep() {
        System.out.println("Online Student is sleeping");

    }

    @Override
    public void attendClass() {
        System.out.println("Online Student is atteding the classes");


    }

    @Override
    public String toString() {
        return "OnlineStudent{}";
    }
}
