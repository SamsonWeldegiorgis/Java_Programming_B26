package day42_custom_class;

public class Car {

    String model ;
    int year ;
    String color;
    int fuelLevel;

    public String toString(){
        return "Model= "+ model+
        "\nYear= "+ year+
        "\nColor= "+ color+
        "\nFuel Level= " + fuelLevel+ "%"+
        "\n" +(isLow() ? "Tank is low" : "Keep on driving");
    }
    public void drive(){
        System.out.println("Fuel Level: " + model);
        fuelLevel-=5;
        System.out.println("Fuel Level: " + fuelLevel);
    }
    public void fillTank() {
        fuelLevel = 100; //+=
        System.out.println("Fuel Level: " + fuelLevel);

    }


        public boolean isLow (){
            return fuelLevel<25;
        }

    // or ....~~~~

//    public boolean isLow (int fuelLevel){
//        if (fuelLevel <25){
//            return true;
//        }else {
//            return false;
    }

