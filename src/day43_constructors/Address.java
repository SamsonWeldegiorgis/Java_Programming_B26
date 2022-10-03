package day43_constructors;

public class Address {

    String street;
    String city;
    String state;
    String zipcode;

//    public Address(String inputStreet , String inputCity, String inputState, String inputZipcode){
//
//        street = inputStreet;
//        city = inputCity;
//        state= inputState;
//        zipcode= inputZipcode;

    /////////another better way //////////////

    public Address(String street , String city, String state, String zipcode){

        this.street= street; // assigning the value of the local street from the parameters to the instance variable street
        this.city = city;
        this.state = state;
        this.zipcode= zipcode;



}
}
