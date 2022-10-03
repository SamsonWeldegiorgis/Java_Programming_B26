package day47_encapsulation;

public class AccessModifier {

    public int a ;      // public modifier
    int b;              // default modifier - no modifier
    private int c;       // private modifier

    public static int x;
    static int y;
    private static int z;

    // in the same class

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
        System.out.println(AccessModifier.z);

        // we can access all the infomation from here !
        // but the problem is with access.....

    }
}
