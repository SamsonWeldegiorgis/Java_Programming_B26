package day43_constructors;

public class Phone {
    /*
        create instance variables : name, brand, memory,version
        ,,,,create constructors : accept and initialize the name
                                  accept and initialize the name & brand
                                  accept and initialize the name & brand & version
        .........create a toString
     */


    String name; // iphone 10
    String brand; //  ,,,,,apple
    int memory;    // 256 gb
    double version; // software


    public Phone(String name) {
        this.name = name;
    }

    public Phone(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Phone(String name, String brand, double version) {
        this.name = name;
        this.brand = brand;
        this.version=version;
    }

    public Phone(String name, String brand, int memory, double version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }
    public String toString(){
        String obj = name;

        if(brand !=null){
            obj +=  " | " + brand;
        }
         if (memory!=0){
             obj += " | " + memory;
         }
        if (version!=0){
            obj += " | " + version;

        }
        return obj;
    }

//  old,,,and would print zeros and unavailable #s
//    public String toString() {
//        return "\nPhone name :" + name +
//                "\nBrand :" + brand +
//                "\nMemory : " + memory +
//                "\nVersion : " + version ;
    }


