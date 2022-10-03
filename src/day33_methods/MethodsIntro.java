package day33_methods;

public class MethodsIntro {

    public static void main(String[] args) {

        sum(3,4);

        int a=3;
        int b=4;

        sum(a,b);

        int g= 40;
        int h= 50;

        sum(g,h);

        // sum(3.3,4); Compiler can do only Implicit Casting

        sum((int) 3.3,4);  // we did casting Explicitly

    }

    public static void sum(int a,int b){

        int c=0;

        System.out.println(a+b);

    }







}