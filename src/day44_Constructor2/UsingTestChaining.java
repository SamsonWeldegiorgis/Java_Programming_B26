package day44_Constructor2;

public class UsingTestChaining {
    public static void main(String[] args) {

        new ChainExample(10);  // 1st by default & ints
          System.out.println();

        new ChainExample("Hello");// 1st by default & Strings
        System.out.println();

        new ChainExample(4.2);// 1st by default & ints & doubles NO Strings
        System.out.println();
    }
}
