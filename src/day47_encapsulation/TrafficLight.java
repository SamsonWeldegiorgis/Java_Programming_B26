package day47_encapsulation;

import java.util.Locale;

public class TrafficLight {
    private String color;
    public TrafficLight (String color){
        this.color=color;
    }

    public String getColor() {
        return color; // to read the color
    }

    public void setColor(String color) {
          switch (color.toLowerCase()){
            case "red":
            case "yellow" :
            case "green":
                this.color = color; // to write/change the color`

        }
    }
}
