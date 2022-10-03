package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Four extends First {

        // different class, different package
    // with inheritance

        public static void main(String[] args) {
            First obj = new First();
            System.out.println(obj.one);
//            System.out.println(obj.two);
//            System.out.println(obj.three);
//            System.out.println(obj.four);
            // they are in different packages,,,unaccessible

            Four obj2 = new Four();
            System.out.println(obj2.one); // public
            System.out.println(obj2.two);  // protected
//            System.out.println(obj2.three);  // default
//            System.out.println(obj2.four);  // private
        }

        /*
        line 13 is trying to directly access a protected variables outside of the package. You can not access any protected info outside the package

        line 19 we able to access the 2 variable b/s it is inhertited from the 1st class to the fourt class, so the two variables belong to the object ot the four class(sub class)

        Other than the protected & protected , the private and the default are not inherited ....;
         */



}
