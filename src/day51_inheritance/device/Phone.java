package day51_inheritance.device;

public class Phone extends Device {

    public Phone(String brand, int model, double price, boolean iswireless) {
        super("Nokia", model, 1500, iswireless);


    }

    public void useDevice() {
        System.out.println(brand+ " is using currently @ "+ price);

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
