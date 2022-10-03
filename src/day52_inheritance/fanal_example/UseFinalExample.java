package day52_inheritance.fanal_example;

public class UseFinalExample {
    public static void main(String[] args) {
        System.out.println(FinalExample.PLANET);
//        FinalExample.PLANET="Mars";   .. impossible

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println();

//        obj.a=4;      // unchangeable it is FINAL
//        obj.b=40;    // unchangeable  it is FINAL

//             obj.b=30;      // unchangeable
//             obj.b=40;    // unchangeable


        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.a);  // still the same
        System.out.println(obj2.b);
    }

    /*
    Obj and obj2 were separarate objects. Each objects has its own copy of instance variables a and b, both are final... so they can NOT be changeed

       a was hard coded to be 5 in the class
       b was assigned in the constructor call

       .. we can not extend the object from the class, it is not valid....b/c the class is final

     */
}
