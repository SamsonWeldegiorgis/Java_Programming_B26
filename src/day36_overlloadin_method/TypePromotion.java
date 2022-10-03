package day36_overlloadin_method;

public class TypePromotion {

    public static void main(String[] args) {
        use(3); // long is closest,,,,,byte>short>int>long>flaot>double
        use(3.5); // double for decimals
        use(1.2f);  // float
        use(3L);  // long
        use(3F);  // float
        use(6.0);  // float

        use((double) 10);

        short s = 5;
        use(s);
    }
    public static void use (float f){
        System.out.println(f+ " : calling float method");
    }
    public static void use(double d){
        System.out.println(d+ " : calling double method");
    }
    public static void use (long l){
        System.out.println(l+ " : calling long method");
    }
    public static void use(int num){
        System.out.println(num+ " : calling int method");
    }
}
