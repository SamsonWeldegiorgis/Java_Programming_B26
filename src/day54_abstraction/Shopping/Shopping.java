package day54_abstraction.Shopping;

public abstract class Shopping {

    public double price;

    public void buyItem(){
        System.out.println("It is bought from Shopping");

}
    public void returnItem(){
        System.out.println("It is returned Shopping");

        // if it is abstract , we can NOT have object of it,,,,
        // abstract is NOT a class
    }
}
