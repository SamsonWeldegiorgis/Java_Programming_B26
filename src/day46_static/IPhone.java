package day46_static;

public class IPhone {

    String model;
    double price;


    static String company;
    static String os;   // os- operating system
    static boolean appleDay;
    static String day;

        static {
            System.out.println("STATIC BLOCK RUN");
            company="Apple";
            os = "IOS";
            day="Wednesday";

            if(day.equals("Friday")){
                appleDay=true;
            }
        }


    // constructor - helps to intilize instatnce variables once objects are created
        public IPhone(String model, double price) {
            System.out.println("CONSTRUCTOR RUN");
            this.model = model;
            this.price = price;


        }
            @Override
            public String toString() {
                return "IPhone{" +
                        "model='" + model + '\'' +
                        ", price=" + price +
                        '}';

    }
}
