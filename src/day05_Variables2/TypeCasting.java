package day05_Variables2;

public class TypeCasting {

    // convert from primitive data type into other,,,

    public static void main(String[] args) {

        byte b = 40;
        int i = b; // the byte value is automatically converted to int, because byte is smaller than int

        int i2 = 100;
        byte b2 = (byte) i2; // int is bigger than byte, so we must cast. We cast the int type - i2 to a byte type using (byte)


        int i3=500;
        long l1 =i3; // int is smaller thatn long, so it will automatically cast
        System.out.println("l1:"+l1);

        long l2= 200;
        int i4= (int) l2 ; // i m trying to go from long to int. Long is bigger than int, so I must cast it

        long l3 = 100000000000L;
//        long l4 = (long)1000000000000;



        double d = 50;
        int i5=(int) d;  // int is smaller than double . Trying to go from double type to int type, we need casting

        System.out.println("\r"+d);
        System.out.println("\r"+i5);

        double d5=600;
        byte b5= (byte) d5;





    }
}
