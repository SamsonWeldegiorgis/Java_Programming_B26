package day51_inheritance.season;

public class Winter extends Season{

    public Winter(String name, double highestTemp, double lowestTemp) {
        super(name, highestTemp, lowestTemp = lowestTemp);


    }
    public void activity(){
        System.out.println(name + " use fireplace");
    }
}
