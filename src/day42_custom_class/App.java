package day42_custom_class;

public class App {

    String name;
    double version;
    boolean isFree ;


    public void run(){
        System.out.println(name + " is running");
    }

    public void update(){
        System.out.println(name + " is updating");
        version +=1.1;
    }

    public String updo(){
      String print = name + " may NOT update ";
        version +=2.1;
        return print;
    }

}
