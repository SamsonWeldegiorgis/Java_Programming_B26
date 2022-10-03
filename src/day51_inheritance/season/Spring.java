package day51_inheritance.season;

public class Spring extends Season {

    public Spring(String name, double highestTemp, double lowestTemp) {
        super(name, highestTemp, lowestTemp);

    }
    public void activity(){
        System.out.println(name + " Go outside ");

}

}
