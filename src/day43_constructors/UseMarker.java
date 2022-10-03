package day43_constructors;

public class UseMarker {
    public static void main(String[] args) {

        Marker marker1 = new Marker("Dry Erase", "Expo","Red");
        System.out.println(marker1);

    }

    /*
    Before was :

    Marker marker = new Marker ();
    marker.type="Dry Erase";
    marker.brand="Expo";
    marker.color="Red";
     */
}
