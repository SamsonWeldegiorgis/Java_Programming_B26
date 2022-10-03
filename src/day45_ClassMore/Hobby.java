package day45_ClassMore;

import java.awt.event.HierarchyBoundsAdapter;

public class Hobby {
    /*
      - data   name, annual cost, is outdoors (boolean), requires others (boolean)
     */

    String name;
    double annualCost;
    boolean isOutDoors;
    boolean others;


    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutDoors=" + isOutDoors +
                ", others=" + others +
                '}';

    }

    public Hobby (String name){
        this.name=name;


    }
    public Hobby (String name, double annualCost){
        this(name);
        this.annualCost=annualCost;

    }
    public Hobby (String name, double annualCost, boolean isOutDoors, boolean others) {
        this(name, annualCost);
        this.isOutDoors = isOutDoors;
        this.others = others;
        doIt();
        amount();


    }
    public void doIt (){
        System.out.println(name +  " isOutDoor : " + isOutDoors );
    }

    public void amount(){
        if (annualCost < 500){
            System.out.println("It is less than 200");
        }else {
            annualCost+=50;
        }
    }

}

