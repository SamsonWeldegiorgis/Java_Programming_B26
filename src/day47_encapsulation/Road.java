package day47_encapsulation;

public class Road {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red");
//        System.out.println( light.color);
//
//        light.color="pink";
//        System.out.println(light.color);

        TrafficLight light2 = new TrafficLight("red");
        System.out.println(light2.getColor());

        light2.setColor("blue");
        System.out.println(light2.getColor());

        TrafficLight light3= new TrafficLight("Black");
        System.out.println(light3.getColor());



    }
}
