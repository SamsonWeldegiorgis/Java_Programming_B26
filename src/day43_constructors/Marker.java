package day43_constructors;

public class Marker {

    String type;
    String brand;
    String color;

    public Marker (String inputType, String inputBrand, String inputColor) {

        type = inputType;
        brand = inputBrand;
        color = inputColor;

    }

    @Override
    public String toString() {
        return "\nMarker: {" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';


    }
}
