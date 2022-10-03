package day51_inheritance.device;

public class TV extends Device {

    public TV(String brand, int model, double price, boolean iswireless) {
        super("Panasonic", model, 1500, iswireless);

    }

    public void useDevice() {
        System.out.println(brand+ " using TV costing " + price );

    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", price=" + price +
                ", iswireless=" + iswireless +
                '}';
    }
}

