package day19_stringExamples2;

public class JavaIsFun {
    public static void main(String[] args) {

        String  words = "Java is fun";

        int firstIndex = words.indexOf(" ");
        int lastIndex = words.indexOf(" ",firstIndex+1);

        System.out.println(words.substring(0,firstIndex));  // Java
        System.out.println(words.substring(firstIndex,lastIndex));  // is
        System.out.println(words.substring(lastIndex, words.length()));  // fun
    }
}
