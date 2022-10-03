package day43_constructors;

import day24_loopExample2.CountJava;

public class UseThisKeyWord {
    public static void main(String[] args) {
        ThisKeyWord obj = new ThisKeyWord(1);
        System.out.println(obj.a);
        // java prioritizes the local,,,NOT this,,,,
    }
}
