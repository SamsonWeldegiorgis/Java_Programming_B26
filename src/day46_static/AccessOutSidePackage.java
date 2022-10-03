package day46_static;

import day47_encapsulation.AccessModifier;

public class AccessOutSidePackage {

    // in the same class

    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
//        System.out.println(obj.b);     // can NOT be ACCESS b/s its outside package
//        System.out.println(obj.c);  // can NOT be ACCESS b/s its Private & outside Package

        System.out.println(AccessModifier.x);
//        System.out.println(AccessModifier.y);   //can NOT be ACCESS b/s its outside package
//        System.out.println(AccessModifier.z); //can NOT be ACCESS b/s its Private & outside Package


        //   ... c & z are private, so they can only be accessed in the same class
        //
        //   b & y are default(didn't hava any other access modifier), so they can only be accessed in the same package.

        // so what is accessible outside a package.
        // public


    }
}
