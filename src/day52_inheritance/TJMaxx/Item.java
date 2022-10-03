package day52_inheritance.TJMaxx;

public class Item {


    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * public constructor with:
     *
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price         assigns to values to instance variables
     */
    public Item(String name, int quantity, int catalogNumber, double price) {
        setCatalogNumber(catalogNumber);
        setQuantity( quantity);
        setName(name);
        setPrice(price);

    }
    public void setName(String name) {
        this.name = name;

    }
    public void setPrice(double price) {
      this.price=price;
    }
    public double getPrice(){
        return price;


    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public int getCatalogNumber() {

        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {

        this.catalogNumber = catalogNumber;
    }

    @Override
    public String toString() {
        return "Regualar Item{" +
                "name='" + name + '\'' +
                ", catalogNumber=" + catalogNumber +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}











