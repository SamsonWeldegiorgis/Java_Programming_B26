package day43_constructors;

public class TrafficLight  {

    String color;
    String size ;
    int weight;

    public String toString() {
        return
    "\n" + (isLess() ? "Less weight" : "keep on");
    }
                        // param,,,,argu
    public TrafficLight(String startColor) {
        color = startColor;
        //instVar = localVar

    }
    public boolean isLess (){
        return weight < 25;


//
//    public TrafficLight(String getSize){
//        size = getSize;
    }

}
