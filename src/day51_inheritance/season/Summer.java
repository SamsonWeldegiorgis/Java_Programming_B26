package day51_inheritance.season;

public class Summer extends Season{

    public Summer(String name, double highestTemp, double lowestTemp) {
        super(name, highestTemp, lowestTemp);

    }
    public void activity(){
        System.out.println(name + " Drink Lemonade");
    }
}
