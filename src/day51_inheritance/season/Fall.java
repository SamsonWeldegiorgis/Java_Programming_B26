package day51_inheritance.season;

public class Fall extends Season{

    public Fall(String name, double highestTemp, double lowestTemp) {
        super(name, highestTemp, lowestTemp);

    }
    public void activity(){
        System.out.println(name + " Read a book");
    }

}
