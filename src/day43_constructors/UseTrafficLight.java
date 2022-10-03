package day43_constructors;

public class UseTrafficLight {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Green");
        System.out.println(light.color);

        TrafficLight light2 = new TrafficLight("Red");
        System.out.println(light2.color);

         light.size= "big";
        System.out.println(light.size);

        System.out.println(light2.weight=90);
        System.out.println(light2.isLess());
        System.out.println(light2);






    }
}
