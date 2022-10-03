package day42_custom_class;

public class Coffee {
    /*
    create coffee class :  price, size(oz), brand , types,,,,
    ex: types : black , capuccino, latte, mocchiato.....
    make toString to print all the info of coffe obj
    Drink : print trying type of coffee
    Refill (amount in oz) : print refilling x oz
                    add the number of oz to the total size
     */
    String name ;
    double size ; // instance parameter
    double price;
    String types;

    public String toString(){
        return "Coffee from Name = " + name +
                "\nSize= " + size + " oz"+
                "\nPrice= "+price+
                "\nTypes= "+ types;

    }

    public void drink () {
        System.out.println("Drinking " + types);
        size-=1.5;
    }

    public void refill(double amount){ // local parameter
        System.out.println("Refilling "+ amount+ " oz of coffee");
        size+=amount;
    }

    /*
        public void refill(double amount){ // local parameter
        System.out.println("Refilling "+ amount+ " oz of coffee");
        size+=amount; // this updates the local size from the parameter ,
        Not the instant size
     */

}
