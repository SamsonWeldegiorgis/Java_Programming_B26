package day47_encapsulation;

public class AccessInPackage {

    // in the same class

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
//        System.out.println(obj.c);  // can NOT be ACCESS b/s its Private

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
//        System.out.println(AccessModifier.z); // can NOT be ACCESS b/s its Private


        // the problem is with access c & z are private ...though they are in the same package.. .....

    }
}
