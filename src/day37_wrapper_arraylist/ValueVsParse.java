package day37_wrapper_arraylist;

public class ValueVsParse {
    public static void main(String[] args) {

        String s = "30";

        int seconds = Integer.parseInt(s); // converts the "30" String to int of 30

        Integer i = Integer.valueOf(s); // converts the "30" String into wrapper class object

        int i2 = Integer.valueOf(s); // converts the "30" String into

        /*
        Integer.ValueOf(s) ;  > converts the 30 String into the Integer object
        int i2 >> Im trying to store the value into a primitive variable

        primitive = object type [ unboxing ]
         */
        Integer i3 = Integer.parseInt(s);
         /*
        Integer.parseInt(s) ;  > converts the 30 String into primitive datatype int
        Integer int i3 >> Im trying to store the value into an integer object

        object type  = primitive [autoboxing ]
         */

        String s2 = String.valueOf(30);
        Integer x = Integer.valueOf(s2);
        System.out.println(s2 + 5 ); // 305
        System.out.println(x + 5 ); // 35

        String m = "60";
        String gg =  m.replace("60","**");
        System.out.println(gg);
        Integer g = Integer.valueOf(m);
        System.out.println(g+5); // 65

    }
}
