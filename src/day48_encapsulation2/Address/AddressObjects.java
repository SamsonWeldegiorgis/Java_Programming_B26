package day48_encapsulation2.Address;

public class AddressObjects {

    public static void main(String[] args) {


        // There is no NO-ARG CONSTR
        // Address address=new Address();

        Address cydeo=new Address("7925 Jones Branch DR Suite 3300","McLean","VA","223182","USA");

        System.out.println(cydeo);

        // write data --> SETTER

        cydeo.setCity("Tysons");


        // read data --> GETTER
        System.out.println(cydeo.getCity());


        /*
        Make country name READ_ONLY

         - Delete SETTER method for country name

         */

        // cydeo.setCountry("");  IT is read_ONLY


        /*

         Make zipCode WRITE_ONLY

           - Delete GETTER
         */

        // cydeo.getZipCode();
    }
}
