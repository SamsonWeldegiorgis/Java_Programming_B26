package day51_inheritance.device;

public class Device {

    String brand;
    int model;
    double price;
    boolean iswireless;

    public Device (String brand, int model, double price, boolean iswireless){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.iswireless=iswireless;

    }

    public void useDevice() {
        System.out.println(brand+model+" is using " + iswireless);

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
