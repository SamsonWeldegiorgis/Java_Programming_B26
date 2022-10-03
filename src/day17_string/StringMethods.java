package day17_string;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

          ///1. // Equaling Method  >>>>>>  .equals ();

        String name = "james";
         // how to compare String values >>>>>use   .equals(" ") ,, we will not use anymore ====
        System.out.println(name.equals("james"));  // true

        System.out.println(name.equals("James"));  // false  lowercase Not equal to Upper case

        System.out.println("cat".equals("dog"));  // false  both are NOT equal     "  ",  ()- is a string literal

        String a = new String("hello");   // same character (hello)= same value
        String b = new String("hello");    //  same memory location

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));   // true, compares a object with b object

        System.out.println(a.equals("hello"));  // true , compares with a object with literal "hello" object

        System.out.println(a.equals("java")); // false , values are not equal

        System.out.println("-------------------------");

        ///2. // Ignoring Cases  Method  >>>>>>  .equalsIgnoreCase ();

        System.out.println(name.equalsIgnoreCase("James"));  // true, ignoring the case sensitivity
        System.out.println(name.equalsIgnoreCase("james"));  // true


        String fan = "false";
        System.out.println("IgnoreCase: "+ fan.equalsIgnoreCase("false")); //true

        System.out.println("-------------------------");


        //3./// length Method  >>>>>>  .length  ();

        System.out.println(name.length());  // 5 characters


        String d = "what";
        System.out.println(name.equals("java")); // 5   ....for james
        System.out.println(d.length()); // false

        String last = "today was fun";  // 13
        System.out.println(last.length());  //false

        System.out.println(last.equals("today"));  // false
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));  // true

        String woo = "Wooden Spoon";
        int wod = woo.length();
        System.out.println(wod);; // 12

        System.out.println("-----CharAt--------------------");

        //4./// charAt ()   >>>>>  .charAt  ()   0 1 2 3 4

        String char1  = "Cydeo";
        char plo = char1.charAt(1);
        System.out.println(plo); // y

        String char5  = "Matching";
        char match = char5.charAt(3);
        System.out.println("Matching:"+ match); // c

        System.out.println("--------LastIndexof-----------------");

        //5./// Last Index  ()   >>>>>  .lastIndexOf () - 1   0 1 2 3 4

         woo = "Wooden Spoon";
        int lastIndex = woo.length() -1;
        System.out.println("Last Index: " + lastIndex ); // n = 11
        System.out.println("Last Index: " + woo.lastIndexOf("") ); // n = 12
        System.out.println("woo = " + woo); // Wooden Spoon
        System.out.println("wod = " + wod);//12

        String text = "I love my wife";
        int lstIndex;
        lstIndex=text.length()-1;
        System.out.println("Ilvmywife: "+lstIndex); // 13

        System.out.println("Substring -----------------------");

        String word = "Play";

        char first = word.charAt(0) ;   //P
        int tstIndex  = word.length()-1;   //3

        System.out.println(first); // P
        System.out.println("" + tstIndex); // 3
        System.out.println(word.substring(tstIndex, word.lastIndexOf(""))); // y

        System.out.print(first); // P
        System.out.print(word.substring(tstIndex, word.lastIndexOf(""))); // y


        System.out.println("-------------------------");

        ///// lower case ()   >>>>>  .lowercase()   0 1 2 3 4

        String str3 = "JAVA ";
        str3.toLowerCase();
        str3= str3.toLowerCase();
        System.out.println(str3);  // java

        String lwr5 = "FRUTA";
        System.out.println("FRUTA");
        lwr5=lwr5.toLowerCase();
        System.out.println("FRUTA lwr:"+ lwr5); // fruta

        System.out.println("-------------------------");

        ///6.// upper case ()   >>>>>  .uppercase ()   0 1 2 3 4

        String upp1 = "Fiki ";
        upp1= upp1.toUpperCase();
        System.out.println(upp1);  // FIKI

        System.out.println("-------------------------");

        //7./// Triming ()   >>>>>  .trim()   0 1 2 3 4

        String trmstr5 = "    Java Programming    Language     ";
        System.out.println("    Java Programming    Language     ");
        trmstr5= trmstr5.trim();
        System.out.println("JvPrgrLang:" + trmstr5);

        String trmstr6 = "    Men from Mars      ";
        System.out.println("    Men from Mars      ");
        trmstr6 = trmstr6.trim();
        System.out.println("MenfromMars:"+ trmstr6);

        System.out.println("-------------------------");

        ///8.// indexOf()   >>>>>  .indexOf()   0 1 2 3 4

        String indexStr6= "Wooden Spoon";

        int indexOfFirstO=indexStr6.indexOf("o");
        System.out.println("indexNumOofFirstO= " +indexOfFirstO); //1

        int indexOfSecondO=indexStr6.indexOf("od");
        System.out.println("indexNumOofSecondO= " +indexOfSecondO); // 2

        int indexOfThirdO=indexStr6.indexOf("oon");
        System.out.println("indexNumOofThirdO= " +indexOfThirdO);  // 9th index

        int indexOfThirdO1=indexStr6.indexOf("po") +1 ;   // OR " The 9th index
        System.out.println("indexNumOofThirdO= " +indexOfThirdO1);

        System.out.println("-------------------------");


        //9./// lastindexOf()   >>>>>  .indexOf()   0 1 2 3 4

        String str7= "Wooden Spoon";

        int indNumOfLastO=str7.lastIndexOf("o");
        System.out.println("indNumOfLastO = " + indNumOfLastO); // 10
        System.out.println("indNumOf100 = " + str7.indexOf(" ")); // 6

        int indNumOfLastN=str7.lastIndexOf("en");
        System.out.println("indNumOfLastN = " + indNumOfLastN); //4

        int indNumOfLast1=str7.lastIndexOf("oo");
        System.out.println("indNumOfLastO = " + indNumOfLast1); // 9


        System.out.println("-------------------------");

        //10./// replace()   >>>>>  .replace()   0 1 2 3 4

        String str8= "Wooden Spoon";
        str8=str8.replace("o","e"); //

        System.out.println("Wooden Spoon: "+str8); // Weeden Speen

        String sentence = "I love java, java is the best program.";
        sentence=sentence.replace( "java", "C#");

        System.out.println(sentence); // I love C#, C# is the best program

        String sentence1 = "I love java, java is the best program.";
        sentence1=sentence1.replace( "c#", "java");

        System.out.println(sentence1); // "I love java, java is the best program.";



        System.out.println("-------------------------");


        //11./// replacefirst()   >>>>>  .replacefirst()   0 1 2 3 4

        String str9= "Wooden Spoon";
       str9 = str9.replaceFirst("o", "e");
        System.out.println(str9);

        String sentence3= "I love java, java is the best";
        sentence3=sentence3.replaceFirst("java", "C#");

        System.out.println(sentence3);


        System.out.println("-------------------------");

        //12./// subString()   >>>>>  .subString()   0 1 2 3 4

        System.out.println(" subString--------------------");

        String stri1= "Java Programming Language ";
        String result=stri1.substring(stri1.indexOf("P"));
        System.out.println(result); // programming Language

        String resultWords= stri1.substring(5,16); // Programming
        System.out.println(resultWords); // programm

        //12.1/// subString()   >>>>>  .subString()  + with Last Index of    0 1 2 3 4


        String resultWords1 = stri1.substring(stri1.indexOf("P"), stri1.lastIndexOf("ing"));
        System.out.println(resultWords1);

        String s1= "I love Java";
        String resultSubstr=s1.substring(2,11);// love java
        System.out.println(resultSubstr);

        String str33 = "Java Programming Language";
        String result10= str33.substring(str33.indexOf("P"), str33.lastIndexOf(" "));
        System.out.println("result10:"+ result10); // Programming Language


        System.out.println("-------------------------");

        //13./// repeat ()   >>>>>  .isEmpty()   0 1 2 3 4

        String str4= "Java";
        String resultRepeat=str4.repeat(5);


        System.out.println(resultRepeat);// javajavajavajavajava


        System.out.println("-------------------------");

        //14/// empty ()   >>>>>  .isEmpty()   0 1 2 3 4

        String rep= "  ";
        boolean repEmpty=rep.isEmpty();


        System.out.println(repEmpty); // false


        System.out.println("-------------------------");


        //15/// blank ()   >>>>>  .isEmpty()   0 1 2 3 4

        String blank= "  ";
        boolean resultblank=rep.isBlank();


        System.out.println(resultblank); // true


        System.out.println("-------------------------");


        //16/// isEqual ()   >>>>>  .isEqual()   0 1 2 3 4

        String strEql= "Java";
        String strWon = "Java";
        String strEql1 = "Javaa";
        boolean isEql=rep.isEmpty();


        System.out.println(strEql==strWon); // true
        System.out.println(strEql.equals(strEql1)); // false


        System.out.println("-------------------------");


        //17/// isEqualsIgnoreCase ()   >>>>>  .isEqualsIgnoreCase()   0 1 2 3 4

        String word1= "JAVA";
        String word2 = "java";



        System.out.println(word1.equals(word2)); // false
        System.out.println(word1.equalsIgnoreCase(word2)); // true


        System.out.println("-------------------------");

        //18/// contains ()   >>>>>  .contain()

        String senCon= "I love Java programing" ;

        boolean hasCSharp = senCon.contains("c#");
         System.out.println("has cSharp: "+ hasCSharp); // false

        boolean hasJava = senCon.contains("JAva");
        System.out.println("has Java: "+ hasJava); // true




        System.out.println("-------------------------");

        //19/// startsWith ()   >>>>>  .startsWith()
        System.out.println(" starts With ");

        String strStart= "Wooden Spoon" ;

        boolean resultStart= strStart.startsWith("wood"); // true
        boolean resultStart5= strStart.startsWith("od"); // true
        boolean resultStart6 =  strStart.startsWith("oon"); // true

        System.out.println(strStart.startsWith("Wood")); // true

        System.out.println(strStart.endsWith("wood")); // true

        System.out.println(strStart.endsWith("spoon")); // true

        System.out.println("---------Additionals --------");
        String str = "abXYabc";

        boolean strContain= str.contains("ab");
        System.out.println("strContain: "+strContain);  //true

        String strSubstring=str.substring(0, str.indexOf("Y"));  // abX Yabc
        System.out.println("strSubString: "+strSubstring);  // abX

        String strSubstring1=str.substring(1, str.length());// a bXYabc
        System.out.println("strSubString1: "+strSubstring1);  //  bXYabc

        String strSubstring2=str.substring(2, str.length()-2);// ab XYabc
        System.out.println("strSubString2: "+strSubstring2);  // XYa

        boolean strEquals= str.equals("ab");
        System.out.println("strEquals: "+strEquals);  // false

        boolean strStart1= str.contains("ab");
        System.out.println("strStart: "+strStart1);  //true








        System.out.println("-------------------------");

























    }
}
